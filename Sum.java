public class Sum{
	public static void main(String[] args) {
		int array[] = {4,8,4,6,3,4};
		int sum=0;
		for (int i=0;i<array.length ;i++ ) {
			sum=sum+array[i];
			System.out.println(sum);
		}

		System.out.println(sum);
	}
}