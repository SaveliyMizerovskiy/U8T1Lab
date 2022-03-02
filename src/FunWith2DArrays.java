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
}
