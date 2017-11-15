
public class BubbleSortExample {

	 static void bubbleSort(int[] array) {  
	        int n = array.length;  
	        int t = 0;  
	         for(int i = 0; i < n; i++){  
	                
	         for(int j = 1; j < (n-i); j++){  
	                        
	        	 if(array[j-1] > array[j]){   
	             t = array[j-1];  
	             array[j-1] = array[j];  
	             array[j] = t;  
 }  
	                          
	  }  
	     }  
	  
	    }  
	    public static void main(String[] args) {  
	                int array[] ={23154, 9260, 3252, 2324, 452, 3260, 5235, 67847, 3092, 986};  
	                 
	                System.out.println("Print array before buble sort: ");  
	                for(int i = 0; i < array.length; i++){  
	                        System.out.print(array[i] + " ");  
	                }  
	                System.out.println();  
	                  
	                bubbleSort(array);  
	                 
	                System.out.println("Preint array After Bubble Sort process: ");  
	                for(int i = 0; i < array.length; i++){  
	                        System.out.print(array[i] + " ");  
	                }  
	   
	        }  
	}  
