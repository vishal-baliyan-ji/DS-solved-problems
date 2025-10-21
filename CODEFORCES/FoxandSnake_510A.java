import java.util.Scanner;
public class FoxandSnake_510A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=0;j<n;j++){
                if(i%2!=0){
                    System.out.print("#");
                }
                else{
                    if((i/2)%2==0 && j==0){
                        System.out.print("#");
                    }
                    else if((i/2)%2!=0 && j==n-1){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(".");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
