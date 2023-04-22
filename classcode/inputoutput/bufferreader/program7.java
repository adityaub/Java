import java.io.*;
import java.util.*;
class program7{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter socity,wing,flatno");
		String info=br.readLine();
		System.out.println(info);

		StringTokenizer obj=new StringTokenizer(info,",");

		String token1=obj.nextToken();
		String token2=obj.nextToken();
		String token3=obj.nextToken();

		System.out.println("socity name="+token1);
		System.out.println("wing="+token2);
		System.out.println("flatno="+token3);
	}
}
