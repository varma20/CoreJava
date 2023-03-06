public class Q{
	int n = 0;
	boolean test = false;
	synchronized int get(){
		while(!test){
			try{
				wait();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Got"+n);
		test = false;
		notify();
		return n;
	}
	synchronized void put(int n){
		while(test){
			try{
				wait();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.n = n;
		test = true;
		System.out.println("Put"+n);
		notify();
	}
}