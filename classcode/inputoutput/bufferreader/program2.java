import java.io.*;
class program2{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter batsman name ");
		String name1=br.readLine();

		System.out.println("Enter Bowler name ");
		String name2=br.readLine();

		System.out.println("batsman name "+name1);
		System.out.println("Bowler name "+name2);
	}
}
