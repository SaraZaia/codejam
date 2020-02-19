import java.io.*;
import java.util.*;

public class A {
	
	public static int maxIO(String s) {
		int r = 0;
		int inumb = 0;
		int Inumb = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				Inumb++;
			}
			if (s.charAt(i) == 'i') {
				inumb++;
			}
			if (s.charAt(i) == 'O') {
				if(Inumb > 0) {
					Inumb--;
					r++;
				} else {
					inumb--;
				}
			}
			if (s.charAt(i) == 'o') {
				if(inumb > 0) {
					inumb--;
				} else {
					Inumb--;
				}
			}
			
		}
		
		return r;
	}
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		//Scanner in = new Scanner(System.in);
	      Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		//System.setOut(new PrintStream("output.txt"));

		int T = Integer.parseInt(in.nextLine());
		int result = 0;
		String s = "";
		
		for (int i = 1; i <= T; i++) {
			s = in.nextLine();
			result = maxIO(s);
			System.out.println("Case #"+ i+": " + result);
			
		}
	}

}
