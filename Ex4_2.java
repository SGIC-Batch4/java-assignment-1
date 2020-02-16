class Ex4_2{
	public static void main(String args[]){
		char[] chArr={'a','b'};
		int count=-1;

		for(int i=0;i<=chArr.length/2;i++){
			if(chArr[i]==chArr[chArr.length-1-i]){
				count++;
			}

		}
		
System.out.println(" count : "+count);

		if(count==chArr.length/2){
			System.out.println("Word is palindrome");
		}else{
			System.out.println("Word is not palindrome");
		}
		
	}
}
