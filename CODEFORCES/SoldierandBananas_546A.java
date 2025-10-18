// Soldier and Bananas 546A
import java.util.Scanner;
public class SoldierandBananas_546A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int bananaPrice=sc.nextInt();
        int hasDollor=sc.nextInt();
        int numBanana=sc.nextInt();
        int need=bananaPrice*(numBanana*(numBanana+1)/2);
        if(need>hasDollor){
            System.out.println(need-hasDollor);
        }
        else{
            System.out.println(0);
        }
        
    }
}
