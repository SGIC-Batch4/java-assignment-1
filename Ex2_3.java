class Ex2_3{
	public static void main(String args[]){
		int nums[] = new int[2];
		nums[0]=5;
		nums[1]=3;
		
		System.out.println("Values before swap");
		System.out.println(" nums[0] : "+nums[0]+" nums[1] : "+nums[1]);
		swap(nums);
System.out.println("Values After swap");
		System.out.println(" nums[0] : "+nums[0]+" nums[1] : "+nums[1]);
		
	}

	public static void swap(int arr[]){
		System.out.println("Inside the function");
		int c=0;
		c=arr[0];
		arr[0]=arr[1];
		arr[1]=c;
		
	}
}
