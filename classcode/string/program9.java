import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter first String:");
		String str1=br.readLine();

		System.out.println("Enter second String:");
		String str2=br.readLine();

		if(strLen(str1)==strLen(str2)){
			System.out.println("String is same");
		}
		else{
			System.out.println("Strng is not same");
		}
	}
	static int strLen(String str){
		char arr[]=str.toCharArray();
		int count=0;

		for(int i=0;i<arr.length;i++){
			count++;

		}
		return count;


	}
}
