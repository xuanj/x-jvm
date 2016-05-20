import java.util.ArrayList;
import java.util.List;

/**
 * @author xuanjian
 * args: -XX:PermSize=10M -XX:MaxPermSize=10M
 */
public class T2RuntimeConstantPoolOOM {

	public static void main(String[] args) {
		//List 保持常量引用池 避免Full GC 回收常量池行为
		List<String> list = new ArrayList<String>();
		int i = 0;
		while(true){
			list.add(String.valueOf(i++).intern());
			if(i > Integer.MAX_VALUE - 10000){
				break;
			}
		}

	}

}
