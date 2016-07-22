/**
 * Rotate the Matric
 */
public class Matrix {

    public static int[][] makeArray(int m) {
        int[][] array = new int[m][m];

        for (int i=0; i<m; i++) {
            for (int j=0; j<m; j++) {
                array[i][j] = m*i + j;
            }
        }
        return array;
    }

    public static void printArray(int array[][]) {
        int m = array.length;
        for (int i=0; i<m; i++) {
            for (int j=0; j<m; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotateArray90dgrs(int array[][]) {
        int m = array.length;
        for (int k=0; k<m/2; k++) {
            for (int j=k; j<m-1-k; j++) {
                int tmp         = array[k][j];
                array[k][j]         = array[j][m-1-k];
                array[j][m-1-k]     = array[m-1-k][m-1-j];
                array[m-1-k][m-1-j] = array[m-1-j][k];
                array[m-1-j][k]     = tmp;
            }
        }
        return array;
    }

    public static int[][] rotateArray180dgrs(int array[][]) {
        return  rotateArray90dgrs(rotateArray90dgrs(array));
    }

    public static int[][] rotateArray270dgrs(int array[][]) {
        return  rotateArray180dgrs(rotateArray90dgrs(array));
    }

    public static void presentation(int m) {
        int[][] array = makeArray(m);
        System.out.println("Original matrix");
        printArray(array);

        System.out.println("\nRotated on 90 dgrs");
        printArray(rotateArray90dgrs(array));

        System.out.println("\nRotated on 180 dgrs");
        printArray(rotateArray180dgrs(array));

        System.out.println("\nRotated on 270 dgrs");
        printArray(rotateArray270dgrs(array));
    }







}
