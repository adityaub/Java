class Program5{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer(100);
		sb.append("Biencaps");
		sb.append("Core2Web");

		System.out.println(sb);
		System.out.println(sb.capacity());

		sb.append("In cabutor");

		System.out.println(sb);
		System.out.println(sb.capacity());
	}
}
