class Demo{
	Demo(){
		System.out.println("No Args");
	}
	Demo(int x){
		System.out.println("para");
	}
	public static void main(String[] args){
		Demo obj=new Demo();
		Demo obj1=new Demo(10);
	}
}

