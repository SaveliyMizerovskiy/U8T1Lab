public class YeeYeeRunner {
    public static void main(String[] args) {
        /* --- PROBLEM 1 --- */
        System.out.println("PROBLEM 1:");

        int[][] testArr1 = {{1, 2}, {3, 4}, {5, 6}};
        // write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in ROW-MAJOR order; i.e. 1, 2, 3, 4, 5, 6

        /* WRITE CODE HERE! */
        for (int row = 0; row < testArr1.length; row++) {
            for (int column = 0; column < testArr1[row].length; column++) {
                System.out.println(testArr1[row][column]);
            }

        }
        System.out.println("---------");
        // now, write code below that uses nested ENHANCED for loops
        // to print each element in testArr1 in row-major order AGAIN; i.e. 1, 2, 3, 4, 5, 6

        /* WRITE CODE HERE! */
        for (int[] row : testArr1){
            for(int column : row){
                System.out.println(column);
            }
        }

        System.out.println("---------");
        // lastly, write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in COLUMN-MAJOR order; i.e. 1, 3, 5, 2, 4, 6

        /* WRITE CODE HERE! */
        for (int column = 0; column < testArr1[0].length; column++) {
            for (int row = 0; row < testArr1.length; row++) {
                System.out.println(testArr1[row][column]);
            }
        }

        /* --- PROBLEM 2 --- */
        System.out.println("---------");
        System.out.println("PROBLEM 2:");

        String[][] testArr2 = {{"ant", "bird", "camel"}, {"dog", "elephant", "fish"}};
        // write code below using a nested ENHANCED for loop to print each element in
        // testArr2 in ROW-MAJOR order; i.e. ant, bird, camel, dog, elephant, fish

        /* WRITE CODE HERE! */
        for (String[] row : testArr2){
            for (String column : row){
                System.out.println(column);
            }
        }

        System.out.println("---------");
        // write code below using an INDEX-BASED nested for loop to print each element in
        // testArr2 in COLUMN-MAJOR order; i.e. ant, dog, bird, elephant, camel, fish

        /* WRITE CODE HERE! */
        for (int column = 0; column < testArr2[0].length; column++) {
            for (int row = 0; row < testArr2.length; row++) {
                System.out.println(testArr2[row][column]);
            }
        }


    }
}
