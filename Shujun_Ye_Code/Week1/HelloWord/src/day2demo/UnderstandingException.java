package day2demo;

public class UnderstandingException {

	public static void main(String[] args) {
		
		try {
			int[] arr = new int[4];
			arr[0] = 1;
			arr[6] = 6;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("passed exception");
	}

}
