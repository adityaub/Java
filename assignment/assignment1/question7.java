class Price{
	public static void main(String[] args){
		double sellingprice=1200;
		double costprice=1000;
		

		if(sellingprice==costprice){
			System.out.println("no proft no loss");

		}
		else if(sellingprice>costprice){
			System.out.println("profit is"+ (sellingprice - costprice));

		}
		else{
			System.out.println("loss is"+ (costprice - sellingprice));
		}
	}
}
