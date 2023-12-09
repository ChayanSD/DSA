package ArraysAndString;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}; // m = 3
        int[] nums2 = {2,5,6}; // n = 3
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        //variables to work as pointers
        int i = m - 1; // will point at m-1 index of nums1 array
        int j = n - 1; // will point at n-1 index of nums2 array
        int k = nums1.length - 1; //will point at the last position of the nums1 array

        // Now traversing the nums2 array
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }

    }
//Question: https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/