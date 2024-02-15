package thread02;

public class HelloJavaExam {

	public static void main(String[] args) {
		new Thread() { 
			@Override
			public void run() {
				try {
					Thread.sleep(100);
					for(int i = 0; i < 5; i++) {
						System.out.println("JAVA");
						Thread.sleep(500);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("HELLO");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
