package operators;
import java.util.Scanner;
public class question4 {

	public static void main(String[] args) {
		System.out.println("enter the vlaue");
		Scanner scan=new Scanner(System.in);
		int a=scan. nextInt();
		int b=scan.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a:"+a+"\n b:"+b);

	}

}
