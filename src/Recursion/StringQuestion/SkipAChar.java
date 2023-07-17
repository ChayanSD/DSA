package Recursion.StringQuestion;

public class SkipAChar {
    public static void main(String[] args) {
        String str = "baccad";
        skip("",str);
        System.out.println(skipChar(str));
    }
    static void skip(String p , String up){
        //p = process ->Ans->Initially empty.
        //up = Unprocessed ->Original string.

        //base condition when ever up is empty , i traverse the entire string and skip a character
        //Now return the process that is my answer.
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1)); //When process is equal to a i don't to add in answer just skip it.
        }else {
            skip(p+ch ,up.substring(1)); //Otherwise not equal to a add character to my answer
        }
    }

    //Approach 2 : I don't want to take 2 arguments , return type will be string
    //Get the same answer.
    static String skipChar(String str){
        if(str.isEmpty()){
            return ""; //
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return skipChar(str.substring(1));
        }else{
            return ch + skipChar(str.substring(1));//When ch != a , just add the char value with the function call.
        }
    }
}
