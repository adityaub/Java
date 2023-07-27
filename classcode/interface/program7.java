interface Demo{
	int x=10;
	void fun();
}
class Demochild implements Demo{
	public void fun(){
		System.out.println(x);
		System.out.println(Demo.x);
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demochild();
		obj.fun();
	}
}
