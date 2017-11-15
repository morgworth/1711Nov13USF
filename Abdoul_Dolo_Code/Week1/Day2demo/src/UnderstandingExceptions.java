
public class UnderstandingExceptions {
	
	public static void main(String[] args) {
		
		int[] arr = new int[4];
		arr[0] = 1;
		
		try{
		arr[6] = 6;
		arr[3] = 2;
		}catch(ArithmeticException e){
			arr[arr.length-1] = 2;
			e.printStackTrace();
		}/*catch(RuntimeException re){
			re.printStackTrace();
		}*/
		finally{
		System.out.println(arr[3]);
		System.out.println("Passed exception");
		
		try{
			exampleException(6);
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
	
