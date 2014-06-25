
public class Hesap extends Thread {
	
	public void run (){
		
		int sayac =0;
		
		while (true) {
			
			System.out.println(sayac++);
			
			if (sayac == 123541) {
				break;
			}
			
		}

	}

	public static void main (String [] arg){
		
		Hesap hesap = new Hesap();
		hesap.start();
		
		
	}
}
