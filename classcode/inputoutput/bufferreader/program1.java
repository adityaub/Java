import java.io.*;
import java.util.*;
class program1{
	public static void main(String[] args)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Name");
		String name=br.readLine();
		System.out.println(name);

		System.out.println("Enter your age");
		int age =Integer.parseInt(br.readLine());
		System.out.println(age);

		
	}
}
