package GenericsInAction;

import java.io.Serializable;
import java.util.ArrayList;

public class Practice<T> implements Serializable,Cloneable,Comparable {
	static ArrayList<String> a=new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ob=new Object();
		ob=1;
		System.out.println(ob);
		String s=ob.toString();
		System.out.println(s);
		a.add("");
	}

	@Override
	public int compareTo(Object t) {
		T sid=(T)t;
		return 0;
	}

}
