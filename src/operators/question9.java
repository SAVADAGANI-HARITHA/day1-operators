package operators;
import java.util.Scanner;
public class question9 {

	public static void main(String[] args) {
		System.out.println("enter the vlaue");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
	   
	    String Result=(num%2==0)?"even":"odd";
		System.out.println("num:"+Result);

	}

}
