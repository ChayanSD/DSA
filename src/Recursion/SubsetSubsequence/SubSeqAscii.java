package Recursion.SubsetSubsequence;

public class SubSeqAscii {
    public static void main(String[] args) {
    String str = "ab";
    subAscii("",str);
    }
    static void subAscii(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subAscii(p+ch , up.substring(1)); //Here , take
        subAscii(p,up.substring(1));//Here, ignore
        subAscii(p+(ch+0),up.substring(1));
    }

}
