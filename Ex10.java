class Ex10{
	public static void main(String args[]){
		String[][] details=new String[4][3];

		details[0][0]="sinthu";
		details[0][1]="0771234567";
		details[0][2]="12, abc street";

		details[1][0]="suresh";
		details[1][1]="0772221234";
		details[1][2]="12, xyz street";

		details[2][0]="ramesh";
		details[2][1]="0772224561";
		details[2][2]="42, lmn street";

		details[3][0]="kumar";
		details[3][1]="0771111234";
		details[3][2]="11, wrt street";

		System.out.println("| Name \t | Conatact \t | Address |");
		System.out.println("| -----\t | -------- \t | --------|");
		for(int j=0;j<4;j++){
			System.out.println("|"+details[j][0] + "\t | "+details[j][1] + "\t | "+details[j][2] +" |");
		}

	}
}
