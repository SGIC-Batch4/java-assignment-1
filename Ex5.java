class Ex5{
	public static void main(String args[]){
		char[] chArr1={'a','p','l','l','e'};
		char[] chArr2={'a','p','e','l','e'};
		boolean status=true;

		for(int i=0;i<chArr1.length;i++){
			if(chArr1[i]!=chArr2[i]){
				status=false;
				break;
			}

		}

		if(status==true){
			System.out.println("Words are same");
		}else{
			System.out.println("Word are not same");
		}
		
	}
}
