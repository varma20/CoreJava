class MyThread extends Thread{
	MyThread(String s){
		super(s);
		start();
	}
	public void run(){
		try{
			while(true){
				if(Thread.currentThread().getName().equals("good morning")){
					System.out.println("good morining");
					Thread.sleep(1000);
				}
				else if(Thread.currentThread().getName().equals("hello")){
					System.out.println("hello");
					Thread.sleep(2000);
				}
				else{
					System.out.println("welcome");
					Thread.sleep(3000);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class ThreadDemo{
	public static void main(String[] args){
		MyThread t1 = new MyThread("good morning");
		MyThread t2 = new MyThread("hello");
		MyThread t3 = new MyThread("welcome");
	}
}