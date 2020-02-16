class Ex2_1{
	public static void main(String args[]){
		System.out.println("Values before swap");
		int a=5;
		int b=3;
		System.out.println(" a : "+a+" b : "+b);
		swap(a,b);
	}

	public static void swap(int a,int b){
		int c=0;
		c=a;
		a=b;
		b=c;
		System.out.println("Values After swap");
		System.out.println(" a : "+a+" b : "+b);
	}
}
