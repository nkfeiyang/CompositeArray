
import junit.framework.*;

public class UnitTest extends TestCase{
	public void testNumber1(){
		int[] arr = new int[] {89, 898};
		String s = MyArray.Composite(arr);
		assertEquals(s, "89898");
	}
	
	public void testNumber2(){
		int[] arr = new int[] {898, 89};
		String s = MyArray.Composite(arr);
		assertEquals(s, "89898");
	}
	
	public void testNumber3(){
		int[] arr = new int[] {8, 89, 898, 897, 887, 878, 87, 88};
		String s = MyArray.Composite(arr);
		assertEquals(s, "8989889788888787887");
	}
	
	public void testNumber4(){
		int[] arr = new int[] {89, 898, 8989, 89898, 89899, 89897};
		String s = MyArray.Composite(arr);		
		assertEquals(s, "898998989898989889897898");
	}
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestCase.class);
	} 
}
