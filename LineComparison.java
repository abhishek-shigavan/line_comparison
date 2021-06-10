/**
 * LineComparison --- program to calculate length of line.
 *
 *
 * @author    Abhishek Shigavan
 */
import java.util.*;

public class LineComparison {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Line Comparison Program...!!");
		System.out.println("Enter Coordinates for Line");

		System.out.println("Enter x coordinates for point A");
                int xa= sc.nextInt();
                System.out.println("Enter y coordinates for point A");
                int ya= sc.nextInt();
                System.out.println("Enter x coordinates for point B");
                int xb= sc.nextInt();
                System.out.println("Enter y coordinates for point B");
                int yb= sc.nextInt();

		int lengthOfLine=(int)(Math.sqrt( ((xb-xa)*(xb-xa)) + ((yb-ya)*(yb-ya)) ));

		System.out.println("Length of line : "+ lengthOfLine);

	}

}

