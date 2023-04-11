class program8{
	public static void main(String[] args){
		int n=153;
		int temp1=n;
		int temp2=n;
		int count=0;

		while(temp!=0){
			count++;
			temp2=temp1/10;
		}
		while(n!=0){
			int rem=n%10;
			int mult=1;
			for(int i=1;i<=n;i++){
				mult=mult*rem;
			}
			sum=sum+mult;
			n=n/10;
		}
		if(temp==sum){
			System.out.println("armstrong no");
		}
		else{
			System.out.println("not armstrong no");
		}
	}
}
