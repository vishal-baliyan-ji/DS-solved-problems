// CodeForse problem 1676B
import java.util.Scanner;
public class EqualCandies_1676B {
    public static int eaten(int[] arrCandy ,int length){
        int min=arrCandy[0];
        int sum=0;
        for(int i=1;i<length;i++){
            if(arrCandy[i]<min){
                min=arrCandy[i];
            }
        }
        for(int i=0;i<length;i++){
            sum+=(arrCandy[i]-min);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numTestCase=sc.nextInt();
        for(int i=0;i<numTestCase;i++){
            int n=sc.nextInt();
            int[] candyArr=new int[n];
            for(int j=0;j<n;j++){
                candyArr[j]=sc.nextInt();
            }
            System.out.println(eaten(candyArr,n));
        }
    }
}
