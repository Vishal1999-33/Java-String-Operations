package topgear;
import java.util.*;

public class Q9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		a=a.toLowerCase();
		char[] arr=a.toCharArray();
		Arrays.sort(arr);
		
		StringBuilder res=new StringBuilder();
		for(int i=1;i<arr.length;i+=2) {
			res.append(arr[i]);
		}
		
		System.out.println(res.toString());
		s.close();
	}
}
