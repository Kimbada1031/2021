import java.util.Scanner;

public class codeTest {

	public static void main(String[] args) {
		int[] tokens = new int[4];
		
		tokens[0] = 500;
		tokens[1] = 100;
		tokens[2] = 50;
		tokens[3] = 10;
		
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		
		int cnt = 0;
		
		for(int i = 0; i < 4; i++) {
			cnt += money/tokens[i];
			money %= tokens[i];
		}
		
		System.out.println(cnt);
	}

}
