
public class I {

	public static void main(String[] args) {
	
		
	int e;
	int power;
	for(int i = 1; i <10; i++) {
		power = 1;
		e = i;
		while(e> 0) {
			power = power*2;
			e--;
		}
		System.out.println(i + " power of " + power);
	}
	}

}
