
public class ClassExamplesWeek1Exceptions {

	
	
	// Throwable
	//    |		   \
	// 	  |		     \
	//  Error          Exception
	//					   \
	//						\
	//						Runtime Exception (unchecked)
	
	
	/*
	 *  Throw    / throws
	 * 		->> propagating
	 * 
	 * try catch finally are all // catch exceptions
	 * 
	 * Exceptions site for reference: http://server2client.com/images/exceptionhierarchy.jpg
	 * 
	 * 		
	 */
	
	public static void main(String[] args){
		
		int[] arr = new int[4];
		arr[0] = 1;
		try{
		arr[6] = 6;
		}catch(ArithmeticException e){
			arr[arr.length-1] = 2;
			e.printStackTrace();
		}finally{
			System.out.println("\n " + arr[3]);
			System.out.println(" passwd exception");
	//	try{
			
	//	}
		
		}
		/*
		 * catch(RuntimeException re){
			re.printStackTrace();
		}
		*/
		
		/*catch(ArrayIndexOutOfBoundsException e){
			System.out.println(arr[3]);
			e.printStackTrace();
			
		}
		System.out.println(arr[0]);
		System.out.println("Passed exception");
		*/
		
	//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\	
	}
	
	void exampleException(int num) throws IOException{
		System.out.println("We are in exaple exception method");
	}
	
	
}
