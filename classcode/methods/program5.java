import java.util.*;
class program5{
	static void add(int a,int b){
		int ans1=a+b;
		System.out.println(ans1);	
	}
	static void sub(int a,int b){
                int ans2=a-b;
                System.out.println(ans2);
        }
	static void mul(int a,int b){
                int ans3=a*b;
                System.out.println(ans3);
        }
	static void div(int a,int b){
                int ans4=a/b;
                System.out.println(ans4);
        }
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter int values");

		int a=sc.nextInt();
		int b=sc.nextInt();

		add(a,b);
		sub(a,b);
		mul(a,b);
		div(a,b);

	}
}
