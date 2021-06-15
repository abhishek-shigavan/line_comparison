import java.util.*;
/**
 * LineComparison --- Program to compare length of two lines.
 * 
 * @author    Abhishek Shigavan
 */
public class LineComparison {

	//variables for line coordinates
	static int xa, xb, ya, yb;

/**
 * Takes point coordinates for line from user
 *  
 * Call legthOfLine method with user given
 * co-oridinate to get length of line
 * 
 * @return lengthOfLine.
  */	
	static int getLegthOfLine() {
		
		Scanner sc = new Scanner(System.in);
		
		//taking co-ordinates from user 
		System.out.println("Enter x co-ordinates for point A");
		xa= sc.nextInt();
		System.out.println("Enter y co-ordinates for point A");
		ya= sc.nextInt();
		System.out.println("Enter x co-ordinates for point B");
		xb= sc.nextInt();
		System.out.println("Enter y co-ordinates for point B");
		yb= sc.nextInt();
		
		//getting length of line
		int lengthOfLine =lengthOfLine(xa,xb,ya,yb);

		return lengthOfLine;
	}

/**
 * Calculate line length 
* 
* @return length of line.
*/
	static int lengthOfLine(int x1,int x2,int y1,int y2) {
			//computing length of line
			int length=(int)(Math.sqrt( ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)) ));
			return length;
	}
/**
 * Computing length of both string
 * If length same the call resultByCompareTo to
 * compare length 
 * Else comparing on basis of length
 * Printing compare result
 * 	 
 * @param lengthOfLine1
 * @param lengthOfLine2
 * 
 * @return No return
 */
	static void compareLength(String lengthOfLine1, String lengthOfLine2) {
		
		//computing length of string
		int s1Length = lengthOfLine1.length();
		int s2Length = lengthOfLine2.length();
		
		//comparing length
		if(s1Length == s2Length) {
			resultByCompareTo(lengthOfLine1,lengthOfLine2);
		}
		else if(s1Length >= s2Length) {
			System.out.println("Length of Line 1 is greater than Line 2");
		}
		else {
			System.out.println("Length of Line 1 is less than Line 2");
		 }
	
	}
/**
 * Comparing string (length of line1 & line2)
 * using compareTo() method.
 * 	
 * @param lengthOfLine1
 * @param lengthOfLine2
 * 
 * @return No return
 */
	 
	 static void resultByCompareTo(String lengthOfLine1, String lengthOfLine2) {
		 
		 //using compareTo() method
		 int compareResult = lengthOfLine1.compareTo(lengthOfLine2);
			
		 	//checking result
			if (compareResult > 0){
				System.out.println("Length of Line 1 is greater than Line 2");
			}
			else if (compareResult < 0) {
				System.out.println("Length of Line 1 is less than Line 2");
			}
			else {
				System.out.println("Line 1 and Line 2 are of equal length" );
			}
	}
/**
 * Printing welcome message
 * calling getLengthOfLine() & compareLength()
 * 	
 * @param args
 * 
 * @return No return
 */
	public static void main(String[] args) {
	
		System.out.println("Welcome to Line Comparison Program...!!");

		System.out.println("Enter Coordinates for Line 1");
		int lengthOfLine1 =getLegthOfLine();
		
		//converting into string	
		String line1Length=Integer.toString(lengthOfLine1);
		System.out.println("Length of line 1 : "+ lengthOfLine1);
		
		System.out.println("Enter Coordinates for Line 2");
		int lengthOfLine2 =getLegthOfLine();
		
		//converting into string
		String line2Length =Integer.toString(lengthOfLine2);		
		System.out.println("Length of line 2 : "+ line2Length);
		
		compareLength(line1Length,line2Length);
	}
	
}

