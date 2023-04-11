class multiply{

	public static void main(String[] args){
		int mul=1;
		int n=135;
		while(n!=0){
			int rem=n%10;
			n=n/10;
			mul=rem*mul;
			System.out.println(rem);

		}
	}
}
