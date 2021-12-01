import java.util.Scanner;

public class codeTest4 {

	public static void main(String[] args) {
		int n, k, cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		k = sc.nextInt();
		
		while(true) {
			 if(n % k != 0) {
				n -= 1;
				cnt += 1;
			}
			n = n / k;
			cnt += 1;
			if(n <= 1) break;
			
		}
		
		System.out.println(cnt);

	}

}
