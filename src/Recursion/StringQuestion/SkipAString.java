package Recursion.StringQuestion;

public class SkipAString {
    public static void main(String[] args) {
    String str = "bcdapplefg";
        System.out.println(skipAString(str));
        System.out.println(skipAppNotApple(str));
    }
    static String skipAString(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
           return skipAString(str.substring(5));
        }else {
            return str.charAt(0) + skipAString(str.substring(1)); //Add the remain string.
        }
    }

    static String skipAppNotApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipAppNotApple(str.substring(3));
        }else {
            return str.charAt(0) + skipAppNotApple(str.substring(1)); //Add the remain string.
        }
    }
}
