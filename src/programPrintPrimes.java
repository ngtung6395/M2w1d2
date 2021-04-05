import java.util.Scanner;

public class programPrintPrimes {
    public static void main(String[] args) {
        System.out.print("Bạn muốn in ra bao nhiêu số nguyên tố? ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printNPrimes(n);
    }
    public static boolean checkPrime(int n) {
        if (n < 2)
            return false;
        else
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
        return true;
    }
    public static void printNPrimes(int n){
        int count = 0;
        int i = 2;
        while (count<n){
           if (checkPrime(i)){
               System.out.println(i);
               count++;
           }
           i++;
        }
    }
}

