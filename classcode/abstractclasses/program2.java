abstract class SPPU{
	void Endsemtime(){
		System.out.println("11 to 1:30");
	}
	abstract void Collegetime();
}
class College extends SPPU{
	void Collegetime(){
		System.out.println("8 to 12");
	}
}
class Client{
	public static void main(String[] args){
		College obj=new College();
		obj.Endsemtime();
		obj.Collegetime();
	}
}
