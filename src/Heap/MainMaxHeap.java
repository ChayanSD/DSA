package Heap;
public class MainMaxHeap {
    public static void main(String[] args) {
        int nums [] = {4,5,3,2,6,1};
//        int nums [] = {3,10,2,4,16,8,29};
        MaxHeap heap = new MaxHeap(nums.length);
        System.out.print("Given Heap Elements :");
       for(int num : nums){
           heap.insert(num);
           System.out.print(num +" ");
       }
        System.out.println();
       heap.print();

    }
}
