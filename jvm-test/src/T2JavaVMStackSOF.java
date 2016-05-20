
/**
 * @author xuanjian args: -Xss160K
 */
public class T2JavaVMStackSOF {

	private int stackLenth = 1;

	public void stackLeak() {
		stackLenth++;
		stackLeak();
	}

	public static void main(String[] args) throws Throwable {
		T2JavaVMStackSOF oom = new T2JavaVMStackSOF();
		try {
			oom.stackLeak();
		} catch (Throwable e) {
			System.err.println("stack length:" + oom.stackLenth);
			throw e;
		}
	}

}
