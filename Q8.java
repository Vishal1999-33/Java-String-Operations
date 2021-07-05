package topgear;
import java.util.*;

public class Q8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		a=a.toLowerCase();
		int[] count=new int[26];
		
		for(int i=0;i<a.length();i++)
			count[a.charAt(i)-'a']++;
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		char c1=' ';
		char c2=' ';
		
		for(int i=0;i<count.length;i++) {
			if(count[i]==0)
				continue;
			if(count[i]<min) {
				c1=(char)((int)'a'+i);
				min=count[i];
			}
			if(count[i]>max) {
				c2=(char)((int)'a'+i);
				max=count[i];
			}
		}
		
		System.out.println("Most occured character is "+c2);
		System.out.println("Least occured character is "+c1);
		s.close();
	}
}
