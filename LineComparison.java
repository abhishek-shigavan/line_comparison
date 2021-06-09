public class LineComparison {

	public static void main(String[] args) {

		//point A coordinates
		int x1 = 2;
		int y1 = 3;
		//point B coordinates
		int x2 = 9;
		int y2 = 6;

		System.out.println("Welcome to Line Comparison Program...!!");

		int lengthOfLine=(int)(Math.sqrt( ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)) ));

		System.out.println("Length of the line : " + lengthOfLine);
	}
}
