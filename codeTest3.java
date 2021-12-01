import java.util.Scanner;

public class codeTest3 {

	public static void main(String[] args) {
		int n, m, min, min2 = 0;
		
		Scanner sc  = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		int cards[][] = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				cards[i][j] = sc.nextInt();
				min = cards[i][0];
				if(min >= cards[i][j]) {
					min2 = min;
					min = cards[i][j];
				}
			}
		}
		
		System.out.println(min2);

	}

}
