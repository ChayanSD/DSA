package Heap;

public class MaxHeap {
    private int [] items;
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
    public void print() {
        System.out.print("MaxHeap elements: ");
        for (int item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    private int getParentIndex(int index){
        return (index-1)/2;
    }
    private int getParentValue(int index){
        return items[getParentIndex(index)];
    }
    private void swap(int a, int b){
        int temp = items[a];
        items[a]= items[b];
        items[b] = temp;
    }
}
