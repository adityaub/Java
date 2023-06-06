class Parent{
	Parent(){
		System.out.println("In parent constructor");
	}
	void ParentProperty(){
		System.out.println("flat,car,gold");
	}

}
class Child extends Parent{
	Child(){
		System.out.println("In child Constructor");
	}
}
class Client{
	public static void main(String[] args){
		Child obj2=new Child();
		obj2.ParentProperty();
	}
}
