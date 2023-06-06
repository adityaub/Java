class ICC{
	ICC(){
		System.out.println("IN ICC constructor");
	}
}
class BCCI extends ICC{
	BCCI(){
		System.out.println("In BCCI constructor");
	}
}
class Client{
	public static void main(String[] args){
		BCCI jayshah=new BCCI();
	}
}
