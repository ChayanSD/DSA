package Heap;

public class MaxHeap {
    private final int [] items;
    private int size;

    public MaxHeap(int size) {
        this.items= new int[size];//Initialized the array.
        this.size=0;
    }
    public void insert(int val){
        //Inset blindly at available slot.
        items[size] = val;
        size++; //increase the size;
        //Not sure that item are at correct index or not
        int index = size-1;//Cause i am increasing the size;
        while (items[index] > 0 && items[index] > getParentValue(index)){
            swap(index,getParentIndex(index));
            index = getParentIndex(index);
        }
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int remove(){
        int itemToRemove = items[0];
        items[0] = items[size-1];//Last item will come first or root position.
        size--;
        //Bubble down
        int index = 0 ; //This is the index that i have to bubble down.
        while (index<size && !validParent(index)){ //I have to bubble down until it's not valid parent.
        int indexOfLargestChild = getLargestChildIndex(index);
        swap(index,indexOfLargestChild);
        index = indexOfLargestChild;
        }
        return itemToRemove;
    }
    public void print() {
        System.out.print("MaxHeap elements: ");
        for (int item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public boolean validParent(int index){
        if(!hasLeftChild(index) && !hasRightChild(index)) return true;
        if(!hasLeftChild(index)) return false;
        if(!hasRightChild(index)) {
            return items[index] > getLeftChild(index);
        }
        return items[index] > getLeftChild(index) && items[index] > getRightChild(index);
    }
    private int getLargestChildIndex(int index){
        if(!hasLeftChild(index)) return index;
        if(!hasRightChild(index)) return getLeftChildIndex(index);

        if(getLeftChild(index) > getRightChild(index)) {
            return getLeftChildIndex(index);
        }
        return getRightChildIndex(index);
    }
    private int getParentIndex(int index){
        return (index-1)/2;
    }
    private int getParentValue(int index){
        return items[getParentIndex(index)];
    }
   private int getLeftChildIndex(int index) { return (index * 2) + 1; }

    private int getRightChildIndex(int index) { return (index * 2) + 2; }

    private int getLeftChild(int index)
    {
        return items[getLeftChildIndex(index)];
    }

    private int getRightChild(int index) {
        return items[getRightChildIndex(index)];
    }

    private boolean hasLeftChild(int index){
        return getLeftChildIndex(index) <= size;
    }

    private boolean hasRightChild(int index){
        return getRightChildIndex(index) <= size;
    }

    private void swap(int a, int b){
        int temp = items[a];
        items[a]= items[b];
        items[b] = temp;
    }
}
