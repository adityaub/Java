class Demo{
	int x=10;
	Demo(){
		System.out.println("In constructor");
		System.out.println(this);
		System.out.println(this.x);
	}
	void fun(){
		System.out.println(this);
		System.out.println(x);
	}
	public static void main(String[] args){
		Demo obj =new Demo();
		System.out.println(obj);
		obj.fun();
	}
}
