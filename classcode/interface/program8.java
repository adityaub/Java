interface A{
	int x=10;
}
interface Child implements A,B{
	int x=30;
	void fun(){
		System.out.println(x);
	}
}
class Client{
	public static void main(String[] args){
		Child obj=new Child();
		obj.fun();
	}
}
