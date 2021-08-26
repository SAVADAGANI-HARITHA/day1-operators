package operators;
import java.util.Scanner;
public class question7 {

	public static void main(String[] args) {
		System.out.println("enter the parameters");
		Scanner scan=new Scanner(System.in);
		int b=scan.nextInt();
		int p=scan.nextInt();
		Float r=scan.nextFloat();
		System.out.println("the borrowed amount :b"+b);
		System .out.println("the period of year:p"+p);
		System.out.printf("the rate of interest:%.2f",+r);
        System.out.printf("the simple interest:%.2f\n",+(b*p*r/100));
	}

}
