class HashDemo{
	public static void main(String[] args){
		String str1="aditya";
		String str2=new String("aditya");
		String str3="aditya";
		String str4=new String("aditya");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
	}
}
