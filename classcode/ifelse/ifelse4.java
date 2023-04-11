class Temperature{
	public static void main(String[] args){
		float temp=93f;

		if(temp>98.6){
			System.out.println("high");
		}
		else if(temp>=98.0 && temp<=98.6){
			System.out.println("Normal");
		}
		else{
			System.out.println("low");
		}

	}
}
