package topgear;
import java.util.*;

public class Q3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String[] arr=a.split(" ");
		String res=arr[0];
		int min=arr[0].length();
		for(int i=1;i<arr.length;i++) {
			if(arr[i].length()<min) {
				res=arr[i];
				min=res.length();
			}
		}
		System.out.println(res);
		s.close();
	}
}
