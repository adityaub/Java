import java.util.*;
class Program9{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();

		int arr[]=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int count1=0;
		int count2=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count1++;
			}
			else
				count2++;
		}
		System.out.println("even count"+count1);
		System.out.println("odd count"+count2);
	}
}
