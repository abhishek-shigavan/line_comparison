public class LineComparison {

	static int lengthOfLine(int x1,int x2,int y1,int y2) {

		int length=(int)(Math.sqrt( ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)) ));
		return length;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparison Program...!!");

		//point A coordinates
		int xa;
		int ya;
		//point B coordinates
		int xb;
		int yb;

		//line1
		xa=2;
		ya=3;
		xb=9;
		yb=6;

		String lengthOfLine1=Integer.toString(lengthOfLine(xa,xb,ya,yb));

		System.out.println("Length of line 1 : "+ lengthOfLine1);

		//line 2
		xa=1;
		ya=3;
		xb=2;
		yb=9;

		String lengthOfLine2=Integer.toString(lengthOfLine(xa,xb,ya,yb));

		System.out.println("Length of line 2 : "+ lengthOfLine2);

		if (lengthOfLine1.equals(lengthOfLine2))
		{
			System.out.println("Line 1 and Line 2 are of equal length");
		}
		else
			System.out.println("Line 1 and Line 2 are not of equal length");
	}

}
