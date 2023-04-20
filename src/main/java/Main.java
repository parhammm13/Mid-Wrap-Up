public class Main {
    public static void main(String[] args) throws Exception {
        Lecture4Exercises obj = new Lecture4Exercises();
//        String test = "never odd or even";
//        String test2 = test.replaceAll("\\s+","");
//        System.out.println(test2);
//        System.out.println(obj.reverse("hello"));
//        System.out.println(obj.isPalindrome("hi"));
//        System.out.println( obj.fibonacci(6));
        Lecture5Exercises obj5 = new Lecture5Exercises();
//        obj5.weakPassword(3);
//        obj5.strongPassword(4);
        Lecture6Exercises obj6 = new Lecture6Exercises();
        int[] arr = {3 ,4 ,5 , 3 ,4 ,6 ,9 ,234, 324324324,234533242,233432
        };
        double a[][] = {
                {1, 3, 2},
                {3, 1, 1},
                {1, 2, 2}
        };
        double b[][] = {
                {2, 1, 1},
                {1, 0, 1},
                {1, 3, 1}
        };
        obj6.calculateEvenSum(arr);
        obj6.reverseArray(arr);
        obj6.matrixProduct(a , b);
        obj6.primeFactors(120);
        System.out.println("---------------------------");
        String temp = "hi how are you";
        obj6.extractWord(temp);
        System.out.println(obj5.isFiboBin(2));
    }
}
