import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num < 2)
            System.out.println("is NOT a prime");
        else {
            boolean check = true;
            int i = 2;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                }
                i++;
            }
            if (check)
                System.out.println(num + " is a prime");
            else
                System.out.println(num + " is NOT a prime");
        }
    }
}
