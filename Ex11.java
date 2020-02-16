class Ex11{
	public static void main(String args[]){

		int choice = 2;

		switch(choice){
			case 1: 
				printSquare();
				break;
			case 2: 
				printRectangle();
				break;
			default:
				System.out.println("please type 1 or 2");
		}
		
		
	}

	public static void printSquare(){
		for(int j=1;j<=10;j++){
			for(int i=1;i<=10;i++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printRectangle(){
		for(int j=1;j<=5;j++){
			for(int i=1;i<=15;i++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	
}
