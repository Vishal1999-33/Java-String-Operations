package topgear;
import java.util.*;

public class Q6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		if(a.length()%2==0) {
			System.out.println(clockwise(a,1));
		}else {
			System.out.println(anticlockwise(a,1));
		}
		s.close();
	}
	
	public static String anticlockwise(String s,int n) {
		String res=s.substring(n)+s.substring(0, n);
		return res;
	}
	
	public static String clockwise(String s,int n) {
		return anticlockwise(s,s.length()-n);
	}
}
