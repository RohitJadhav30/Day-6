import java.util.Scanner;

public class Perfect {

    public static boolean isPerfect(int num){
        if(num <= 1){
            return false;
        }

        int sum = 0;
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum == num;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        sc.close();

        if(isPerfect(num)){
            System.out.println("The number is a perfect number");
        }
        else{
            System.out.println("The number is not perfect number");
        }
    }
}
