package Activity;

public class sumarray {
	public static void main(String[] args) {
    int sum =0;
	int arr[]={1,2,3,4,5};
	for(int i :arr) {
		System.out.println(i);
		sum=sum+i;
	}
		System.out.println("sum=" +sum);
}
}

