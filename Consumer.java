public class Consumer implements Runnable{
	Q q;
	Consumer(Q q){
		this.q = q;
		new Thread(this,"Consumer").start();
	}
	public void run(){
		int i = 0;
		try{
			while(true){
				q.get();
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}