import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {

	public static void main(String[] args) {
		// we insert here our value
		int n = 10 ;

		int d = 2;
		if (d != 0 && (n % d) == 0)
			System.out.println(d + " is factor of " + n);
		
		ArrayList<String> list = new ArrayList<>();
		list.add("aima");
		list.add("bima");
		list.add("come");
		list.add("demo");
		
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		String name = "nasim";
		StringBuilder builder = new StringBuilder(name);
		for(int i = builder.length()-1; i>=0; i--) {
		  System.out.print(builder.charAt(i));
		 
		}
		 System.out.println();
		String na = "come";
		String re = " ";
		char ch;
		for (int i = 0; i <na.length(); i++) {
		  ch = na.charAt(i);
		  re = ch+re;
		}
		System.out.println(re);
		
		
	}

}
