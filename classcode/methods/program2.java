class Demo{
	int x=10;
	static int y=20;
	void fun(){
		System.out.println("IN fun method");
	}
	static void gun(){
		System.out.println("In gun method");
	}
	public static void main(String[] args){

		Demo obj =new Demo();
		System.out.println(obj.x);
		System.out.println(y);
		obj.fun();
		gun();	
	}
}
