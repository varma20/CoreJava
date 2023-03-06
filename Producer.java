public class Producer implements Runnable{
	Q q;
	Producer(Q q){
		this.q = q;
		new Thread(this,"Producer").start();
	}
	public void run(){
		int i=0;
		try{
			while(true){
				q.put(i++);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}