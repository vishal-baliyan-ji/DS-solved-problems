// CodeForces 2044A
import java.util.Scanner;
public class EasyProblem_2044A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<length;i++){
            System.out.println(arr[i]-1);
        }
    }
}
