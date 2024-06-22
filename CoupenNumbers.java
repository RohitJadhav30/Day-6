import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CoupenNumbers {

    public static int distinctCoupen(int num){
        Set<Integer> distinct = new HashSet<>();

        int countCoupen = 0;

        Random random = new Random();

        while(distinct.size() < num){
            int newCoupen = generateRandomCoupen(num, random);
            countCoupen++;
            distinct.add(newCoupen);
        }
        return countCoupen;
            
    }

    public static int generateRandomCoupen(int num, Random random){
        return random.nextInt(num) + 1;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coupons");
        int num = sc.nextInt();
        sc.close();

        int countCoupen = distinctCoupen(num);

        System.out.println("Total random numbers need to generate distinct coupens is: " + countCoupen);

        
    }
}
