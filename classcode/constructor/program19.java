class Demo{
	static {
		System.out.println("Ststic block1");
	}
	public static void main(String[] args){
		System.out.println("In demo main");
	}
}
class Client{
	static{
		System.out.println("Staticblock2");
	}
	public static void main(String[] args){
		System.out.println("In client main");
	}
	static {
		System.out.println("Static block 3");
	}
}
