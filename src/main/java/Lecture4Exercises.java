

public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        int a = 1 ;
        for ( int i = 1  ; i < n+1 ; i++ ){
             a *= i;
        }
        return a;
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) { // it print n - 1 number
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } }
    //        return a;


    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        StringBuilder temp = new StringBuilder(word);
        word = String.valueOf(temp.reverse());
        return word ;
    }
    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line) {
        line = line.replaceAll("\\s+","");
        line = line.toLowerCase();
        StringBuilder temp = new StringBuilder(line);
        String templine = String.valueOf(temp.reverse());
        if(templine.equals(line)){
            return true;
        }else {
            return false;
        }
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {
        char map[][] = new char[str1.length()][str2.length()];
        for(int i =  0 ; i < str1.length(); i++){
            for(int j = 0 ; j < str2.length() ; j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    map[i][j] = '*';
                }else{
                    map[i][j] = ' ';
                }
            }
        }
        return map;
    }
}
