package topgear;
import java.util.*;

public class Q5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		StringBuilder res=new StringBuilder();
		char[] arr=a.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>='A' && arr[i]<='Z')
				res.append((char)(arr[i]+'a'-'A'));
			if(arr[i]>='a' && arr[i]<='z')
				res.append((char)(arr[i]+'A'-'a'));
		}
		System.out.println(res.toString());
		s.close();
	}
}
