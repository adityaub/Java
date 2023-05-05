import java.util.*;
class Program{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int arr[][]=new int[3][];

		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[1];

		System.out.println("Enter elements");

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int[]x:arr){
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}
