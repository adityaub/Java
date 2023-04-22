import java.util.*;
class program7{
	public static void main(String[] args){
		int count=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Array size");
		int size=sc.nextInt();

		int arr[]=new int[size];
		System.out.println("Enter Elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		
		if(arr[i]%2==0){
			count++;
		
		System.out.println(count);
		}
		}
		
	}
}
