import java.util.*;
class DataOverflowException extends RuntimeException{
	DataOverflowException(String msg){
		super(msg);
	}
}
class DataUnderflowException extends RuntimeException{
	DataUnderflowException(String msg){
		super(msg);
	}
}
class ArrayDemo{
	public static void main(String[] args){
		int arr[]=new int[5];

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter integer value");
		System.out.println("Note: 0<element<100");

		for(int i=0;i<arr.length;i++){
			int data=sc.nextInt();

			if(data<0)
				throw new DataUnderflowException("data less than 0");
			if(data>100)
				throw new DataOverflowException("data greater than 100");
				arr[i]=data;
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
	}
}
