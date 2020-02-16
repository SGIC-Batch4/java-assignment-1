class Person{
	public String name;
	public int age;
	public String address;

}


class Ex10x{
	public static void main(String args[]){
		Person[] personsArr=new Person[4];

		Person person1=new Person();
		person1.name="sinthu";
		person1.age=25;
		person1.address="12, abc street";

		Person person2=new Person();
		person2.name="suresh";
		person2.age=45;
		person2.address="12, xyz street";

		Person person3=new Person();
		person3.name="ramesh";
		person3.age=78;
		person3.address="42, lmn street";

		Person person4=new Person();
		person4.name="kumar";
		person4.age=56;
		person4.address="11, wrt street";

		personsArr[0]=person1;
		personsArr[1]=person2;
		personsArr[2]=person3;
		personsArr[3]=person4;

		System.out.println("| Name \t | Conatact \t | Address |");
		System.out.println("| -----\t | -------- \t | --------|");
		for(int j=0;j<4;j++){
			System.out.println("|"+personsArr[j].name + "\t | "+personsArr[j].age + "\t | "+personsArr[j].address +" |");
		}

	}
}
