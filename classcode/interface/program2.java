interface Demo{
	void fun();
	void gun();
}
abstract class Demochild implements Demo{
	public void gun(){
		System.out.println("In gun");
	}
}
class Demochild1 extends Demochild{
	public void fun(){
		System.out.println("In fun");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demochild1();
		obj.fun();
		obj.gun();
	}
}
