package Algorithms.Searching.LinearSearch.Questions;

public class SearchInString {
    public static void main(String[] args) {
    String str ="chayan";
    char target ='a';
        System.out.println(search(str,target));
    }
    static boolean search(String str , char target){
        if(str.length()==0){
            return false;
        }
//        for(int i = 0 ; i<str.length();i++){
//            if(str.charAt(i)==target){
//                return true;
//            }
//        }
        //Replace with foreach loop
        for(char ch :str.toCharArray()){
            if(target==ch) return true;
        }
        return false;
    }
}
