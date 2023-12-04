package ArraysAndString;

public class ChessBoardSquare {
    public static void main(String[] args) {
        String coordinates = "h3";
        System.out.println(squareIsWhite(coordinates));
    }
    public static boolean squareIsWhite(String coordinates) {
        char x = coordinates.charAt(0);
        int y = coordinates.charAt(1);

        if (x%2==0){
            if (y%2==0){
                return false;
            }else {
                return true;
            }
        }else {
            if (y%2==0){
                return true;
            }else {
                return false;
            }
        }

    }
}
