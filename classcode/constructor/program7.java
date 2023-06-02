class MacD{
	int noofBurgers=5;
	String Product="Fries";
	void menu(){
		String str1="veg";
		String str2="Non-Veg";
		System.out.println(noofBurgers);
	}
}
class User{
	public static void main(String[] args){
	MacD obj=new MacD();
	obj.menu();
	}
}
