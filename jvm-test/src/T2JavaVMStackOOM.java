
public class T2JavaVMStackOOM {
	
	private void dontStop(){
		while(true){
		}
	}

	public void stackLeakByThread(){
		while(true){
			Thread thread = new Thread(new Runnable() {
				
				@Override
				public void run() {
					dontStop();
				}
			});
			thread.start();
		}
	}
	public static void main(String[] args) {
		T2JavaVMStackOOM oom = new T2JavaVMStackOOM();
		oom.stackLeakByThread();	

	}

}
