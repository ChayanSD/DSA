package Arrays;

public class TwoArraySameOrNot {

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bcc"};

       System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w = "";
        String w2 = "";
        for (String word : word1) {
            w += word;
        }

        for (String wo : word2) {
            w2 += wo;
        }
        if (w.length()!=w2.length()){
            return false;
        }
        if (w.contains(w2)) {
            return true;
        }

        return false;
    }
}