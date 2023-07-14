package Recursion.ArrayQuestionRecursion;

public class ArraySortedOrNot {
    public static void main(String[] args) {
            int [] arr = {};
        System.out.println(isSorted(arr,0));
    }
    static boolean isSorted(int [] arr,int index){
        //Base condition
        if(index==arr.length-1){
            return true;
            //My index pointer reaches at last means my array is sorted;
        }
        return arr[index] < arr[index+1] && isSorted(arr,index+1);
    }
}
