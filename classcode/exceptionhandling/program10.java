class Demo{
	void m1(){
	
	}
	void m2(){
	
	}
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.m1();
		obj=null;
		try{
			obj.m2();
		}catch(ArithmeticException obj5){
			System.out.println("Here");
		}finally{
			System.out.println("connection closed");
		}
		System.out.println("End main");
	}
}
