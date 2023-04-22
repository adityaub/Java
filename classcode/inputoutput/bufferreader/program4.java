import java.io.*;
class program4{
public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

	System.out.println("Enter Building name");
	String name=br.readLine();
	
	System.out.println("Enter wing name");
	char wing=(char)br.read();
	br.skip(1);

	System.out.println("Enter flat no");
	int flatno =Integer.parseInt(br.readLine());

	System.out.println("Name="+name);
	System.out.println("wing="+wing);
	System.out.println("flat no="+flatno);
	}
}
