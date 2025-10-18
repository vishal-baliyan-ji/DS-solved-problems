// CodeForces Wrong Subtraction 997A
import java.util.Scanner;
public class WrongSubtraction_977A {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int subtractTimes=sc.nextInt();
        for(int i=0;i<subtractTimes;i++){
            if(num%10==0){
                num/=10;
            }
            else{
                num-=1;
            }
        }
        System.out.println(num);
    }
    
}
