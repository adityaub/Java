class StringDemo{
	public static void main(String[] args){
		String str1="kanha";
		String str2="kanha";
		String str3=new String("kanha");
		String str4=new String("kanha");
		String str5=new String("rahul");
		String str6="rahu;";

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));
	}
}
