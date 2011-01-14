
public class MyArray {
	/* Assumption: Let's consider the two numbers. The easiest way is to just 
	 * convert them to string and make them connect together, there are only 2
	 * results for it. And we can determine which one should be placed at the first
	 * position to meet our requirement. Then when it comes to 3 numbers, for example
	 * arr[0], arr[1] and arr[2]. Once we know arr[0]arr[1] and arr[1]arr[2] is a fittable
	 * result, we also know that arr[0]arr[1]arr[2] is the fittable one.
	 * 
	 * So, just like a bubble sort, we first find the heaviest the number and put it in 
	 * position 0, then second one, and so on...
	 * 
	 * At last, combines all the numbers in the array. Here I just return the String instead 
	 * of the integer. 
	 */
	public static String Composite(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    continue;
                
                String si = String.valueOf(arr[i]);
                String sj = String.valueOf(arr[j]);
                
                String max = si;
                
                if (Long.valueOf(si + sj) < Long.valueOf(sj + si)) {                  
                    max = sj;                    
                }

                if (max != si) {
                	arr[j] = arr[i];
                    arr[i] = Integer.valueOf(max);                    
                }
            }            
        }
		
		String s = ""; 
        for (int i = 0; i < arr.length ; i++) {
            s += String.valueOf(arr[i]);
        }
		return s;
	}
}
