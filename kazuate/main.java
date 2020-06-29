import java.util.*;

public class Kazuate{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int rand = (int)(Math.random() * 80) + 10;
        
        System.out.print("かず当てゲーム");

        int times = 5;
        int count = 1;
        
        System.out.print("数字を入力してください");
        int num = sc.nextInt();

        while(count < 5 && rand != num){
            
            System.out.println("はずれです");

            if (num > rand) {
                System.out.println("大きいです");
                if ((num - rand) >= 20){
                    System.out.println("20以上差があります");
                }
            } else {
                System.out.println("小さいです");
                if ((rand - num) >= 20){
                    System.out.println("20以上差があります");
                }
            }

            count ++;

            num = sc.nextInt();
        }

        if (rand == num){
            System.out.println("当たりです");
        } else{
            System.out.println("残念でした");
            System.out.println("上限回数に達しました");
        }
        
    }
}