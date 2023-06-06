class Demo{
	int x=10;
	Demo(){
		System.out.println("In noargs constructor");
	}
	Demo(int x){
		this();
		System.out.println("In Para constructor");
	}
	public static void main(String[] args){
			Demo obj2=new Demo(50);
	}
}
