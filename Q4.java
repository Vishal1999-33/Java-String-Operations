package topgear;
import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String[] arr=a.split(" ");
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		s.close();
	}
}
