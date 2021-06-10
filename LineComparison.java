/**
 * LineComparison --- program to compare length of two lines.
 *
 * @author    Abhishek Shigavan
 */
import java.util.*;

public class LineComparison {

	//variables for line coordinates
	static int xa, xb, ya, yb;

/**
   * Takes point coordinates from user
   * and store it in array
	   * @return return array.
  */
	static int[] getUserInput() {

		Scanner sc = new Scanner(System.in);
		int[] userInput = new int[4];

		System.out.println("Enter x coordinates for point A");
		xa= sc.nextInt();
		System.out.println("Enter y coordinates for point A");
		ya= sc.nextInt();
		System.out.println("Enter x coordinates for point B");
		xb= sc.nextInt();
		System.out.println("Enter y coordinates for point B");
		yb= sc.nextInt();

		userInput[0]=xa;
		userInput[1]=ya;
		userInput[2]=xb;
		userInput[3]=yb;

		return userInput;
	}

/**
 	* Calculate line length
	*
	* @return return length of line.
  */
	static int lengthOfLine(int x1,int x2,int y1,int y2) {
			int length=(int)(Math.sqrt( ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)) ));
			return length;
		}

	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparison Program...!!");

		System.out.println("Enter Coordinates for Line 1");
		int coordinatOfLine1[]=getUserInput();

		xa=coordinatOfLine1[0];
		xb=coordinatOfLine1[2];
		ya=coordinatOfLine1[1];
		yb=coordinatOfLine1[3];

		String lengthOfLine1=Integer.toString(lengthOfLine(xa,xb,ya,yb));
		System.out.println("Length of line 1 : "+ lengthOfLine1);

		System.out.println("Enter Coordinates for Line 2");
		int coordinateOfLine2[]=getUserInput();

		xa=coordinateOfLine2[0];
		xb=coordinateOfLine2[2];
		ya=coordinateOfLine2[1];
		yb=coordinateOfLine2[3];

		String lengthOfLine2=Integer.toString(lengthOfLine(xa,xb,ya,yb));
		System.out.println("Length of line 2 : "+ lengthOfLine2);

		int compareResult=lengthOfLine1.compareTo(lengthOfLine2);

		if (compareResult > 0){
			System.out.println("Length of Line 1 is greater than Line 2");
		}
		else if (compareResult < 0) {
			System.out.println("Length of Line 1 is less than Line 2");
		}
		else{
			System.out.println("Line 1 and Line 2 are of equal length" );
		}
	}

}
