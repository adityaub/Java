//Arraylist
import java.util.*;
class ArrayListDemo extends ArrayList{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		//add(Element)
		al.add(10);
		al.add(20.5f);
		al.add("Shashi");
		al.add(10);
		al.add(20.5f);

		System.out.println(al);

		//size():
		System.out.println(al.size());

		//contains(object);
		System.out.println(al.contains("Shashi"));
		System.out.println(al.contains(30));

		//indexOf()object;
		System.out.println(al.indexOf(10));

		//lastIndexOf(object);
		System.out.println(al.lastIndexOf(20.5f));

		//get(int);
		System.out.println(al.get(3));

		//set(int,E);
		System.out.println(al.set(3,"Incubator"));
		System.out.println(al);

		//add(int.E);
		al.add(3,"core2web");
		System.out.println(al);

		//java.lang.object[] toArray();
		Object arr[]=al.toArray();
		System.out.println(arr);
		for(Object data:arr){
			System.out.println(data+" ");
		}
		System.out.println();



	}
}
