class program7{
	public static void main(String[] args){
		int n=4;
		int sum=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
		if(sum==n){
			System.out.println("perfect no");
		}
		else{
			System.out.println("not perfect no");
		}
	}
}
