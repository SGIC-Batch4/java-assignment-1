class Ex4_1{
	public static void main(String args[]){
		char[] chArr={'a','p','l','l','p','a'};
		 boolean status=true;

		for(int i=0;i<=chArr.length/2;i++){
			if(chArr[i]!=chArr[chArr.length-1-i]){
				status=false;
				break;
			}

		}

		if(status==true){
			System.out.println("Word is palindrome");
		}else{
			System.out.println("Word is not palindrome");
		}
		
	}
}
