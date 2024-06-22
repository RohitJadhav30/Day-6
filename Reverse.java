import java.util.Scanner;

public class Reverse {

    public static int reverse(int num){
        int rem, reverse = 0;
        while(num != 0){
            rem = num % 10;
            reverse = (reverse * 10) + rem;
            num /= 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println("The reverse number is: " + reverse(num));

    }
}
