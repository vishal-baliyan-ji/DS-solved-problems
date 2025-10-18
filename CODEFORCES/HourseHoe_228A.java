// CodeForces Is your horseshoe on the other hoof? 228A
import java.util.HashSet;
import java.util.Scanner;
public class HourseHoe_228A {
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            s.add(sc.nextInt());
        }
        System.out.println(4-s.size());
    }
}
