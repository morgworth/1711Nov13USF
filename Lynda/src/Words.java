




import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Words {

	
	 public static void createMadLib(String fileName) throws FileNotFoundException{
	
	
    
    File input = new File(fileName);
    File madlib = new File("HelloWorld/src/logs/students.txt");
    Scanner in = new Scanner(input);
    ArrayList<String> words = new ArrayList<String>();
    while(in.hasNext())
    {
        words.add(in.next());
    }
    File output = new File("finished.txt");
    PrintWriter out = new PrintWriter(output);
    in.close();
    in = new Scanner(madlib);
   
    while(in.hasNext())
    {
        if(in.hasNextInt())
        {
            int pos = in.nextInt();
            pos--;
            out.print(" "+words.get(pos)+" ");
        }
        else
            out.print(in.next() + " ");
    }
    out.close();
}

}
