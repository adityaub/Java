//cursor
import java.util.*;
class IteratorDemo{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		al.add("kanha");
		al.add("rahul");
		al.add("ashish");

		Iterator itr =al.iterator();
		while(itr.hasNext()){
			if("Rahul".equals(itr.next()));
			itr.remove();
			System.out.println(itr.next());
		}
		System.out.println(al);
	}
}
