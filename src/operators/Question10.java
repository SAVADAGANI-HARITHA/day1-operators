package operators;
import java.util.Scanner;
public class Question10 {

	public static void main(String[] args) {
		System.out.println("enter the vlaue");
		Scanner scan=new Scanner(System.in);
		int l=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("exact length of the rope:"+2*(l+b));
		System.out.println("exact quantity of carper:"+(l*b));

	}

}
