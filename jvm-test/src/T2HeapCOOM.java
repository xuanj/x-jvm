import java.util.ArrayList;
import java.util.List;

/**
 * @author xuanjian
 * args -Xms20M -Xmx20M -XX:+HeapDumpOnOutOfMemoryError
 *
 */
public class T2HeapCOOM {
	
	static class OOMObject{
		
	}

	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<>();
		while(true){
			list.add(new OOMObject());
		}

	}

}
