package Recursion.ArrayQuestionRecursion;

import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
            int [] arr ={1,2,6,4,4};
            int target = 4;
//        System.out.println(searchIndexFromLast(arr,target,arr.length-1));
        System.out.println(findAllIndex3(arr,target,0));
//        System.out.println(list);
    }
    static boolean search(int [] arr, int target , int index){
        if(index==arr.length){
            return false;//Index is bigger than array size means error.
        }
        return arr[index]==target || search(arr,target,index+1);//Ether 1s't half will be true or 1 'nd half
    }
    static int searchIndex(int [] arr , int target , int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return searchIndex(arr,target,index+1);
        }
    }
    static int searchIndexFromLast(int [] arr , int target , int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return searchIndexFromLast(arr,target,index-1);
        }
    }
 static ArrayList<Integer> list = new ArrayList<>();
    static void searchAllIndex(int [] arr , int target , int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        searchAllIndex(arr,target,index+1);
    }
    //In this approach we are going to return an arrayList
    static ArrayList<Integer> findAllIndex2(int [] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex2(arr,target,index+1,list);
    }
    static ArrayList<Integer> findAllIndex3(int [] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //This will contain answer for that function call only.
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowFunctionCall= findAllIndex3(arr,target,index+1);
        list.addAll(ansFromBelowFunctionCall);//This will add all the answer in list.
        return list;
    }
}
