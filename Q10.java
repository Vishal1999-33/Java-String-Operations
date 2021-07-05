package topgear;
import java.util.*;

public class Q10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		a=a.toLowerCase();
		
		int age=a.length()+(a.charAt(a.length()-1)-'a')+1;
		System.out.println("Age of the String is "+age);
		s.close();
	}
}
