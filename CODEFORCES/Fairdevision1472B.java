import java.util.Scanner;
public class Fairdevision1472B {
    public static boolean isFairDevision(int[] candyArr,int length){
        int sum=0;
        int countEven=0;
        int countOdd=0;
        for(int i=0;i<length;i++){
            sum+=candyArr[i];
            if(candyArr[i]%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        if(sum%2!=0) return false;
        if(countOdd%2!=0) return false;
        if(countOdd==0 && countEven%2!=0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numTestCase=sc.nextInt();
        for(int i=0;i<numTestCase;i++){
            int numCandy=sc.nextInt();
            int[] arrCandy=new int[numCandy];
            for(int j=0;j<numCandy;j++){
                arrCandy[j]=sc.nextInt();
            }
            if (isFairDevision(arrCandy,numCandy)==true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
