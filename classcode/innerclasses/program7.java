class Demo{
	void marry(){
		System.out.println("Kriti sonan");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo(){
			void marry(){
				System.out.println("Disha patani");
			}
		};
		obj.marry();
	}
}
