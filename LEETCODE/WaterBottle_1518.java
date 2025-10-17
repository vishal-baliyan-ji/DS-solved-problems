//LeetCode problem 1518
class WaterBottle_1518{
    public static int maxBottlesDrunk(int numBottles, int numExchange) {
        int drunk=0;
        
        while(numBottles>=numExchange){
            drunk+=numExchange;
            numBottles=numBottles-numExchange+1;
            
        }
        drunk+=numBottles;
        return drunk;
        
    }
	public static void main(String[] args) {
		System.out.println(maxBottlesDrunk(15,4));
	}
}