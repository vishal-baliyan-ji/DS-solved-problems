// CodeForces Sakurako and Kosuke 2033A
import java.util.Scanner;
public class SakurakoandKosuke_2033A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numTestCase=sc.nextInt();
        for(int i=0;i<numTestCase;i++){
            int x=0;
            int num=sc.nextInt();
            boolean turn =true;
            for(int j=1;-num<x && num>x ;j++){
                if(turn == true){
                    x=x-(2*j-1);
                    turn =false;
                }
                else{
                    x=x+(2*j-1);
                    turn =true;
                }
            }
            if(turn){
                System.out.println("Sakurako");
            }
            else{
                System.out.println("Kosuke");
            }
        }
    }
}
