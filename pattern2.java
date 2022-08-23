package Activity;

public class pattern2 {

	public static void main(String[] args) {
		int i,j;
		int a=1;
		for(i=1;i<=4;i++) {
		for(j=1; j<=i;j++) {
				System.out.print(a);
				a++;
				if(a>9) {
					break;
				}
			}
			System.out.println();

	}}}
