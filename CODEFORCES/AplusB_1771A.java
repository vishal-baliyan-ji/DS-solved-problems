// CodeForces problem  1772A
import java.util.Scanner;
public class AplusB_1771A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            String s=sc.next();
            arr[i]=(s.charAt(0)-'0')+(s.charAt(2)-'0');
        }
        for(int i:arr){
            System.out.println(i);
        }

    }
}
