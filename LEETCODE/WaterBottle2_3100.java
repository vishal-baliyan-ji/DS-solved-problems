//Leetcode problem 3100
public class WaterBottle2_3100 {
    public static int maxBottlesDrunk(int numBottles, int numExchange) {
        int drunk=0;
        
        while(numBottles>=numExchange){
            drunk+=numExchange;
            numBottles=numBottles-numExchange+1;
            numExchange++;
        }
        drunk+=numBottles;
        return drunk;
        
    }
	public static void main(String[] args) {
		System.out.println(maxBottlesDrunk(10,3));
	}
}
