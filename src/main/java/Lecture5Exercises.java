import java.util.UUID;
import java.util.Random;
public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letterss
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder Sb = new StringBuilder(length);
        Random random = new Random();
        for(int i = 0 ; i < length ; i++){
            Sb.append(letters.charAt(random.nextInt(letters.length())));
        }
        String weakpassword = Sb.toString();
//        System.out.println(weakpassword);
        return weakpassword;
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int length) throws Exception {

        return null;
    }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public boolean isFiboBin(int n) {
        int a = 0;
        int b = 1;
        while (b < n){
                int temp = b;
                b = a + b;
                a = temp;
        }
        return b==n || n ==0;
    }
}
