public class Main {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                 sum += i;
            }
        }
        System.out.println("Sum of even numbers from 0 to 1000 is " + sum);

        int sumOddNumbers = 0 ;
        int j = 0;
        while ( j < 1000){
            if (j % 2 !=0){
                sumOddNumbers += j;
            }
            j++;
        }
        int finalSum = addNumbers (1000,false);
        System.out.println("Sum of odd numbers recursive is" + finalSum);
        }
        public static int addNumbers (int n, boolean isEven){
        if (!isEven) n--;
        return sumN(n);
    }
    public static int sumN (int n){
        if (n > 0 ) {
            return n + sumN(n - 2);
        } else {
            return 0;
        }
    }
}