import java.util.Arrays;

public class FunWith2DArrays {
    public static int totalElements(int[][] intArr){
        int total = 0;
        for (int[] int1: intArr){
            for (int int2: int1){
                total ++;
            }
        }
        return total;
    }

    public static void fourCorners(String[][] strArr){
        for (String[] str1: strArr) {
            if (str1 == strArr[0]){
                System.out.println(str1[0]);
                System.out.println(str1[str1.length-1]);
            }
            if (str1 == strArr[strArr.length-1]){
                System.out.println(str1[0]);
                System.out.println(str1[str1.length-1]);
            }
            if (strArr.length < 1){
                System.out.println(str1[0]);
                System.out.println(str1[str1.length-1]);
            }

        }
    }
    public static double average(int[][] intArr){
        int count = 0;
        double total = 0.0;
        for (int row = 0; row < intArr.length; row++) {
            for (int column = 0; column < intArr[0].length; column++) {
                count++;
                total += intArr[row][column];
            }

        }
        return total/count;
    }
    /* Add a static method named indexFound that takes a 2D array of Strings and a target String as parameters and
    returns a 1D array containing two elements indicating the row and column where the target is found in the 2D array.
    For example, if the 2D array is {{"a", "b", "c"}, {"d", "e", "f"}} and the target String is "f", then this method should return [1, 2],
    since "f" is found in row 1, column 2 (0-indexed).  If the target is not found, return [-1, -1]
     */
    public static int[] indexFound(String[][] intArr, String target){
        int row = -1;
        int column = -1;
        for (int rowi = 0; rowi < intArr.length; rowi++) {
            for (int columni = 0; columni < intArr[0].length; columni++) {
                if (intArr[rowi][columni].equals(target)){
                    row = rowi;
                    column = columni;
                }
            }
        }
        int[] returnArr = {row, column};
        return returnArr;
    }

}
