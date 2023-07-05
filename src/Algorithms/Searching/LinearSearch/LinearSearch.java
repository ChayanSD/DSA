package Algorithms.Searching.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
    int arr[] ={3,4,2,1};
    int target = 1;
        System.out.println(search(arr,target));
    }
    //Search in the array : return the index if item found.
    //otherwise return -1;means item not found.
    static int search(int [] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
