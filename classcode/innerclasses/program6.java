class Outer{
	class Inner{
		void fun2(){
			System.out.println("Fun2-Inner");
		}
	}
	void fun1(){
		System.out.println("Fun1-Outer");
	}
}
class Client{
	public static void main(String[] args){
		Outer obj=new Outer();
		obj.fun1();

		Outer.Inner obj1=obj.new Inner();
		obj1.fun2();
	}
}
