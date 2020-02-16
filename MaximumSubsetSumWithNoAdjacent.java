
public class MaximumSubsetSumWithNoAdjacent {

	//solution 1 Time complexity O(n) space complexity O(n)
	public static int maximumSubsetSumWithNoAdjacent(int array[]){
		//check if size of input array is zero
		if(array.length == 0)
		return 0;
		//Initialize the temp array with same size as input array
		int temp [] = new int[array.length];
		//Initialize first element with first element of input array
		temp[0] = array[0];
		//Initialize secon element with max val b/w first and sec of i/p array
		temp[1] = Math.max(array[0], array[1]);
		//Traverse from length 2 to length-1 of i/p array
		for(int i = 2;i<array.length;i++)
		{
			temp[i] = Math.max(temp[i-1], temp[i-2]+array[i]);
		}
		//return the last index element of temp array
		return temp[array.length-1];
	}
	

	//solution 2 Time complexity O(n) space complexity O(1)
	public static int maximumSubsetSumWithNoAdjacent2(int array[]){
		//check if size of input array is zero
		if(array.length == 0)
		return 0;
		//Take two variables to store ith-1 and ith-2 to values		
		int first = array[0];
		int second= Math.max(array[0], array[1]);
		
		//Traverse from length 2 to length-1 of i/p array
		for(int i = 2;i<array.length;i++)
		{
			int temp = Math.max(second, first+array[i]);
			first = second;
			second = temp;
		}
		//return the variable second
		return second;
	}
	public static void main(String[] args) {
		// sample test
		System.out.println(maximumSubsetSumWithNoAdjacent2(new int [] {7,10,12,7,9,14}));
	}

}
