package operators;
import java.util.Scanner;
public class question6 {

	public static void main(String[] args) {
		 System.out.println("enter the vlaue");
	     Scanner scan=new Scanner (System.in);
	     int s=scan.nextInt();
	     int l=scan.nextInt();
	     int b=scan.nextInt();
	     Float r=scan.nextFloat();
	     System.out.println("areaof square"+(s*s));
	     System.out.println("area of the rectangle"+(l*b));
	     System.out.printf("radius of circle:%.2f",+(3.14*r*r));

	}

}
