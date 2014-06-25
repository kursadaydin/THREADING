
public class Islem implements Runnable {
	private int sayac =0;
	private int islemNo;
	
	
	

	public Islem(int islemNo) {
		super();
		this.islemNo = islemNo;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		 while(true){
	            System.out.println("Islem " + this.islemNo + " : " + this.sayac++);
	        }
	}
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Islem islem1 = new Islem(1);
		Islem islem2 = new Islem(2);
		
		Thread thread1 = new Thread(islem1);
		Thread thread2 = new Thread(islem2);
		
		thread1.start();
		thread2.start();
	}

}
