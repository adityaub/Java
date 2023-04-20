import java.io.*;
class program3{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Enter player name ");
		String name=br.readLine();

		System.out.println("Enter jersy No ");
		int jerno=Integer.parseInt(br.readLine());

		System.out.println("Enter Avarage");
		float avg=Float.parseFloat(br.readLine());


		System.out.println(name);
		System.out.println(jerno);
		System.out.println(avg);
	}
}
