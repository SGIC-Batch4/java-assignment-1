class Ex1{
	public static void main(String args[]){
		int a=5;
		int b=3;

		System.out.println("values before swap " );
		System.out.println("a : "+ a + " b : "+b);

		// Swap the values without using temporary variable
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("values after swap " );
		System.out.println("a : "+ a + " b : "+b);
	}
}
