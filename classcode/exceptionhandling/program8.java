import java.io.*;
class ExceptionDemo{
	public static void main(String[] args){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String str=br.readLine();
		System.out.println(str);

		int data=Integer.parseInt(br.readLine());
		System.out.println(data);
	}
}
