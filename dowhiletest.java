import java.util.*;
public class dowhiletest {

	public static void main(String[] args) {
		int number=0,sum=0;
		Scanner input = new Scanner(System.in);
		do {
			sum+=number;
			System.out.println("enter the no.");
			number=input.nextInt();
		}
		while(number>=0); {
			System.out.println("sum is"+sum);;
			input.close();
		}
	}}
		
	


