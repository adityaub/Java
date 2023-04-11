class IfElse{
	public static void main(String[] args){
		int num1=1;
		int num2=2;
		int num3=3;

		if(num1>num2 && num1>num3){
			System.out.println("num 1 is greater");
		}
		else if(num2>num1 && num2>num3){
			System.out.println("num2 is greater");
		}
		else if(num3>num1 && num3>num2){
			System.out.println("num 3 is greater");
		}
		else if(num1>num2 && num1==num3){
			System.out.println("num 1 & 3 are equal and greater");
		}
		else if(num2>num1 && num2==num3){
			System.out.println("num 2 & 3 are equal and greater");
		}
		else{
			System.out.println("num 1 & 2 are equal and greater");
		}
	}
}
