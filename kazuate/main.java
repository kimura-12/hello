import java.util.*;

public class Kazuate{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int rand = (int)(Math.random() * 100);
        if (rand < 10){
            rand = rand + 10;
        }
        
        System.out.println("Numbers Game!!");

        int times = 5;
        int count = 1;
        
        System.out.println("Please inpute a number");
        int num = sc.nextInt();

        while(count < 5 && rand != num){
            
            System.out.println("Miss");

            if (num > rand) {
                System.out.println("Your input number is big");
                if ((num - rand) >= 20){
                    System.out.println("more than 20 difference");
                }
            } else {
                System.out.println("Your input number is small");
                if ((rand - num) >= 20){
                    System.out.println("more than 20 difference");
                }
            }

            count ++;

            num = sc.nextInt();
        }

        if (rand == num){
            System.out.println("hit");
        } else{
            System.out.println("reached the maximum number of times");
            System.out.println("That is too bad.");
            System.out.println("The correct answer is " + rand);
        }
        
    }
}