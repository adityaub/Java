class Parent{
	Parent(){
		System.out.println("Parent constructor");
	}
	void fun(){
		System.out.println("In Parent fun");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child constructor");
	}
	void fun(){
		System.out.println("In child fun");
	}
}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
		obj.fun();
	}
}
