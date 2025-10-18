// CodeForces Boy Or Girl 236A
import java.util.Scanner;
import java.util.HashSet;
public class BoyorGirl_236A {
    public static void main(String[] args) {
        HashSet<Character> sh=new HashSet<>();
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            sh.add(s.charAt(i));
        }
        if(sh.size()%2!=0){
            System.out.println("IGNORE HIM!");
        }
        else{
            System.out.println("CHAT WITH HER!");
        }
    }
}
