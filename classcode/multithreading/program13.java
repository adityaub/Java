class MyThread extends Thread{
	MyThread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(50000);
		}catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}
class ThreadGroupDemo{
	public static void main(String[] args)throws InterruptedException{
		ThreadGroup pThreadGP=new ThreadGroup("India");

		MyThread t1=new MyThread(pThreadGP,"maha");
		MyThread t2=new MyThread(pThreadGP,"goa");

		t1.start();
		t2.start();


		ThreadGroup cThreadGP=new ThreadGroup(pThreadGP,"Pakistan");

                MyThread t3=new MyThread(cThreadGP,"maha");
                MyThread t4=new MyThread(cThreadGP,"goa");

                t3.start();
                t4.start();


		ThreadGroup cThreadGP2=new ThreadGroup(pThreadGP,"Bangledesh");

                MyThread t5=new MyThread(cThreadGP2,"dhaka");
                MyThread t6=new MyThread(cThreadGP2,"mirpur");

                t5.start();
                t6.start();

		cThreadGP.interrupt();
		System.out.println(pThreadGP.activeCount());
		System.out.println(pThreadGP.activeGroupCount());
	}
}
