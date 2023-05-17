class YouTube{
	String content1="Movies";
	String content2="comedyvideos";

	void popularyoutuber1() {
		
		String Youtubername="bbkivines";
		double views=4704939502.0;

		System.out.println("Youtuber name="+Youtubername);
		System.out.println("Total views="+views);
	}
	void popularyoutuber2() {
		String Youtubername="Dhruv Rathee";
		double views=1552678163.0;

		System.out.println("Youtuber name="+Youtubername);
                System.out.println("Total views="+views);
	}

}
class play{
	public static void main(String[] args){
		YouTube obj=new YouTube();

		obj.popularyoutuber1();
		obj.popularyoutuber2();
	}
}
