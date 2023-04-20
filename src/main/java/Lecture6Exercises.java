import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at Lecture6Exercises
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a += arr[i];
        }
        return a;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        int[] b = new int[arr.length];
        int j = arr.length;
        for (int i = 0; i < arr.length; i++) {
            b[j - 1] = arr[i];
            j = j - 1;
        }
        System.out.println(b[0]);
        return b;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        int row1 = m1.length;
        int col1 = m1[0].length;
        int row2 = m2.length;
        int col2 = m2[0].length;
        double temp[][] = new double[row1][col2];
        if (col1 == row2) {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < row2; k++) {
                        temp[i][j] = temp[i][j] + m1[i][k] * m2[k][j];
                    }
                }
            }
            return temp;
        } else {
            return null;
        }
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) { // i did'nt get it
        return null;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        ArrayList primefactor = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
//                System.out.print(i + " ");
                primefactor.add(i);
                n /= i;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < primefactor.size(); i++) {
            if (primefactor.get(i).equals(2)) {
                a++;
            } else if (primefactor.get(i).equals(3)) {
                b++;
            } else if (primefactor.get(i).equals(5)) {
                c++;
            }
        }
        return primefactor;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        List<String> list = Arrays.asList(line.split(" "));
//        List<String> words = new ArrayList<String>();
//        String[] words = line.split("\\s");
//        line.split("\\s+"));
//        System.out.println(words[0]);
        System.out.println(list);
        return list;
    }
}

