import java.io.IOException;

public class Read {

	public static void main(String[] args) throws IOException {
		
		char ch, answer= 'k';
		
		System.out.println("im thinking of a litter between A to Z");
		System.out.println("Guess");
		
		ch =(char) System.in.read();
		do {
			
		
		if(ch == answer) {
			System.out.println("you win");
		}
		else {
			System.out.println("you lost");
		}
	}while (ch ==answer);

}
}