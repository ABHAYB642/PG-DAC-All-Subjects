import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumeration {

	public static void main(String[] args) {
		Vector <String> v=new Vector<>();
		v.add("java");
		v.add(".net");
		v.add("wpt");
		v.add("cpp");
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
