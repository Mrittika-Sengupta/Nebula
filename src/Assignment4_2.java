
public class Assignment4_2 {

	public static void main(String[] args) {
		// peiris -> reverse siriep
		
		reverseString("peiris");

	}
	
	public static void reverseString(String inputString){
		byte[] strAsByteArray = inputString.getBytes();
		
		byte[]result = new byte[strAsByteArray.length];
		
		//loop through the byte array  in reverse order
		
		for(int i = 0; i<strAsByteArray.length; i++ ){
		
		//Assign characters in reverse order to the result
		
		result[i] = strAsByteArray [strAsByteArray.length - i -1];
		
		//convert the byter array back to a string and print the reverse
		}
		
		System.out.println(new String(result));
		
		
	}
	
 // index:  0 1 2 3 4 5
// value:   P E I R I S	
	
	//when i = 0
	// result[0] = 6 - 0 - 1 =  5 = S
	//result [1] = 6 - 1 - 1 = 4 = I
	//result [2] = 6 - 2 -1 = 3 =R
	
	
	
}
