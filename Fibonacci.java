import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        sc.close();

        System.out.print(num1 + " " + num2);

        for(int i = 1; i <= limit; i++){
            num3 = num1 + num2;
            System.out.print(" " + num3);
            
            num1 = num2;
            num2 = num3;
        }
    }
}