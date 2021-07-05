package topgear;
import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String b=s.nextLine();
		
		if(!a.equals(b)) {
			System.out.println("Reverse Not Supported");
		}else {
			String res=reverse(a);
			System.out.println(res);
		}
		s.close();
	}
	
	public static String reverse(String s) {
		StringBuilder str=new StringBuilder(s);
		return str.reverse().toString();
	}
}
