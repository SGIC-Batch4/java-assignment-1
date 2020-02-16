class Ex6{
	public static void main(String args[]){
		int[] nums={3,5,1,2,7};
		
		for(int i=0;i<2;i++){
			for(int j=0;j<nums.length-1;j++){
				if(nums[j] > nums[j+1]){
					int c=0;
					c=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=c;
				}
			}

		}

		System.out.println(" Second maximum is : "+nums[nums.length-2]);
		
	}
}
