import java.util.*;



public class While_dowhile_test {

	public static void main(String[] args) {
		int sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Ënter the number");
		int number = input.nextInt();
		while(number>=0) {
			sum+=number;
			System.out.println("Enter the number");
			number=input.nextInt();
		}
		System.out.println("sum is"+sum);;
		input.close();

	}

}
