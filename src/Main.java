import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //part 1
        String[][] seatingChart = {{"Abby", "Don", "George", "Kim"},
                                    {"Brian", "Elanor", "Harry", "Lenny"},
                                    {"Cathy", "Fred", "Jill", "Matt"}};
        for (String[] strArr: seatingChart){
            System.out.println(Arrays.toString(strArr));
        }
        seatingChart [1][2] = "Paul";
        for (String[] strArr: seatingChart){
            System.out.println(Arrays.toString(strArr));
        }
        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart [2][3];
        seatingChart[2][3] = temp;
        for (String[] strArr: seatingChart){
            System.out.println(Arrays.toString(strArr));
        }
        String[] tempStr = seatingChart [0];
        seatingChart[0] = seatingChart [1];
        seatingChart [1] = tempStr;
        for (String[] strArr: seatingChart){
            System.out.println(Arrays.toString(strArr));
        }

        // part 2
        int[][] arr2 = new int[3][2];
        int[][] arr1 = new int[2][3];
        for (int[] int1: arr1){
            System.out.println(Arrays.toString(int1));
        }
        for (int[] int2: arr2){
            System.out.println(Arrays.toString(int2));
        }
        arr1 [0][0] = 1;
        arr1 [0][1] = 2;
        arr1 [0][2] = 3;
        arr1 [1][0] = 4;
        arr1 [1][1] = 5;
        arr1 [1][2] = 6;
        for (int[] int1: arr1){
            System.out.println(Arrays.toString(int1));
        }
        arr2 [0][0] = 1;
        arr2 [0][1] = 4;
        arr2 [1][0] = 2;
        arr2 [1][1] = 5;
        arr2 [2][0] = 3;
        arr2 [2][1] = 6;
        for (int[] int2: arr2){
            System.out.println(Arrays.toString(int2));
        }

        //part 3
        int[][] intList = {{5, 2},
                {1, 3},
                {7, 9}};

        System.out.println(FunWith2DArrays.totalElements(intList));

        String[][] str = {{"phone", "mouse", "keyboard"}};
        FunWith2DArrays.fourCorners(str);

        // TEST CODE FOR average
        int[][] testArr1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(FunWith2DArrays.average(testArr1));
        int[][] testArr2 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.average(testArr2));
        int[][] testArr3 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.average(testArr3));
        int[][] testArr4 = {{4}, {7}, {8}, {2}};
        System.out.println(FunWith2DArrays.average(testArr4));
        int[][] testArr5 = {{4}};
        System.out.println(FunWith2DArrays.average(testArr5));
        // TEST CODE FOR indexFound
        String[][] words = {{"hi", "bye", "stuff", "go"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "stuff")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "good")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "map")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "cat")));
        System.out.println("--------------");

        String[][] words2 = {{"time", "up", "bye"}, {"hi", "hit", "up"}, {"map", "bam", "low"}, {"bow", "mom", "joy"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "time")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "joy")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "bam")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "cat")));


    }
}
