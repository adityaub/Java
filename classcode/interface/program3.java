interface Demo1{
	void fun();
}
interface Demo2{
	void fun();
}
class Demochild implements Demo1,Demo2{
	public void fun(){
		System.out.println("In fun child");
	}
}
class client{
	public static void main(String[] args){
		Demo1 obj1=new Demochild();
		obj1.fun();

		Demo2 obj2=new Demochild();
		obj2.fun();
	}
}
