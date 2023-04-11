import java.util.Scanner;
class program1{
	public static void main(String[] args){
		Scanner obj=new Scanner (System.in);

		System.out.println("Enter your name:");
		String name=obj.next();

		System.out.println("Enter your age");
		int age=obj.nextInt();

		System.out.println(name);
		System.out.println(age);
	}
}
