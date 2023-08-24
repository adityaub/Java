import java.util.*;
class CricPlayer{
	int jerNo=0;
	String Name=null;

	CricPlayer(int jerNo,String Name){
		this.jerNo=jerNo;
		this.Name=Name;
	}
	public String toString(){
		return Name;
	}
}
class ArrayListDemo{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		al.add(new CricPlayer(18,"virat"));
		al.add(new CricPlayer(7,"Dhoni"));
		al.add(new CricPlayer(45,"rohit"));

		System.out.println(al);
	}
}
