// CodeForces 492A
import java.util.Scanner;
public class VanyaAndCube_492A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int height =0;
        int i=1;
        while(num>=0){
            num=num-((i*(i+1))/2);
            if(num>=0){
                height=height+1;
                i++;
            }
            else{
                break;
            }
            
        }
        System.out.println(height);
    }
}
