package topgear;
import java.util.*;

public class Q2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		int n1=0;
		int n2=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='A' && a.charAt(i)<='Z')
				n1++;
			else
				n2++;
		}
		if(n1==n2)
			System.out.println("Equally Distributed");
		else {
			System.out.println("No. of Uppercase characters: "+n1);
			System.out.println("No. of Lowercase characters: "+n2);
		}
		s.close();
	}
}
