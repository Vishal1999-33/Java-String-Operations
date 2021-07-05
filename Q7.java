package topgear;
import java.util.*;

public class Q7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String b=s.nextLine();
		int i=0;
		int j=0;
		StringBuilder str=new StringBuilder();
		while(i<a.length() && j<b.length()) {
			str.append(a.charAt(i));
			str.append(b.charAt(j));
			i++;
			j++;
		}
		while(i<a.length()) {
			str.append(a.charAt(i));
			i++;
		}
		while(j<b.length()) {
			str.append(b.charAt(j));
			j++;
		}
		System.out.println(str.toString());
		s.close();
	}
}
