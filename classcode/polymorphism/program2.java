class Parent{
	Parent(){
		System.out.println("Parent constructor");
	}
	void Property(){
		System.out.println("Home,car,gold");
	}
	void Marry(){
		System.out.println("Deepeeka padukone");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child constructor");
	}
	void Marry(){
		System.out.println("Alia Bhatt");
	}
}
class Client{
	public static void main(String[] args){
		Child obj=new Child();
		obj.Property();
		obj.Marry();
	}
}
