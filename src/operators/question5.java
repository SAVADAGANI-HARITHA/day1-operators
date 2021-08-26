package operators;
import java.util.Scanner;
public class question5 {

	public static void main(String[] args) {
			System.out.println("enter the five students marks");
			Scanner scan=new Scanner(System.in);
			Float a=scan.nextFloat();
			Float b=scan.nextFloat();
			Float c=scan.nextFloat();
			Float d=scan.nextFloat();
			Float e=scan.nextFloat();
			Float sum=a+b+c+d+e;
			Float avg=sum/5;
			System.out.printf("the average  of five  students is:%.2f",avg);
	}

}
