
public class NumberOfWaysToMakeChange {
	
	public static int numberOfWaysToMakeChange(int denominations[] , int targetAmount)
	{
		//create an array of length target amount +1 that represents the number of ways
		//index value represent the amount value
		int ways[] = new int[targetAmount+1];
		//Initialise the index position 0 value as 1
		ways[0] = 1;
		//Iterate over the denominations
		for (int d = 0; d < denominations.length; d++) {
			for (int w = 1; w < ways.length; w++) {
				//check if denomination value is less than equal to amount
				if(denominations[d] <= w)
				{
					ways[w] += ways[w-denominations[d]];
				}
			}			
		}
		
		return ways[targetAmount];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOfWaysToMakeChange(new int[]{1,5,10,15},10));

	}

}
