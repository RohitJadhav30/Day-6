import java.util.Scanner;

public class Prime {

    public static boolean isPrime(int num){
        for(int i = 2; i < Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        if(isPrime(num)){
            System.out.println("The number is prime number");
        }
        else{
            System.out.println("The number is not prime number");
        }

   } 
}
