import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CompositeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try
		{
			System.out.println("Please input numbers (should not be negative), return for quit: ");
			
			InputStream iStream = System.in;
	        BufferedReader reader = new BufferedReader(new InputStreamReader(iStream));
	        
	        while (true) {
	        	System.out.print(">");
	        	String line = reader.readLine();	        	
	            if (line == null) {
	                System.exit(0);
	            }
	            StringTokenizer tokens = new StringTokenizer(line);
                if (tokens.countTokens() == 0) {
                    break;
                }
                
                int[] arr = new int[tokens.countTokens()];
                	
                for(int i=0; i<arr.length; i++) {
                 	String number = tokens.nextToken();
                   	arr[i] = Integer.valueOf(number);                   	
                }
                System.out.println(MyArray.Composite(arr));
	        }			
		}
		catch (Exception ex) {
            ex.printStackTrace();
        }
	}

}
