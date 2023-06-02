class Project{
	String ProjName="Online edu";
	int noofEmp=20;

	void ClientInfo(){
		String ClientName="Core2Web";
		System.out.println(ClientName);
		System.out.println(ProjName);
		System.out.println(noofEmp);
	}
}
class C2W{
	public static void main(String[] args){
		Project obj=new Project();
		obj.ClientInfo();
	}
}
