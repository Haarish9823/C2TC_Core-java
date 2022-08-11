class Eclipse implements Runnable{

	
	public void run() {
		System.out.println("Eclipse thread ID is" + " "+Thread.currentThread().getId());
		
	}
}
class PPT implements Runnable{


	public void run() {
		System.out.println("PPT thread ID is"+" "+Thread.currentThread().getId());	
	}
	
}
public class Multithread {

	public static void main(String[] args) {
		Eclipse obj = new Eclipse();
		Thread t = new Thread(obj);
		t.start();
		PPT obj1 = new PPT();
		Thread t1 = new Thread(obj1);
		t1.start();

	}

}
// Eclipse thread ID is 15
// PPT thread ID is 16
