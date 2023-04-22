import java.util.*;
class program8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		StringTokenizer st=new StringTokenizer(str," ");

		System.out.println(st.countTokens());
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

	}
}
