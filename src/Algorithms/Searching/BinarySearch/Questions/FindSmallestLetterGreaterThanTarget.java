package Algorithms.Searching.BinarySearch.Questions;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
      char[]  letters = {'c','f','j'};
      char target = 'a';
        System.out.println(nextGreatestLetter(letters,target));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length;
        while (s <= e){
            int m = s +(e-s)/2;
            if(target <letters[m]){
                e= m -1;
            }else {
                s =m +1;
            }
        }
        return letters[s % letters.length];
        //It will return char.
    }
}
//LeetCode : https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
