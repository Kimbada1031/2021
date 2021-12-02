import java.util.Scanner;

public class ch4_1_1 {

	public static void main(String[] args) {
		int n, x = 1, y = 1, nx = 0, ny = 0;
		
		int dx[] = {0, 0, -1, 1};
		int dy[] = {-1, 1, 0, 0};
		String move_n[] = {"L", "R", "U", "D"};
 		
		String move_data[] = new String[6];
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 0; i < 6; i++) {
			move_data[i] = sc.next();
			for(int k = 0; k < 4; k++) {
				if(move_data[i] == move_n[k]) {
					System.out.println(move_data[i] + ", " + move_n[k]);
					nx = x + dx[k];
					ny = y + dy[k];
				}

			}
			x += nx;
			y += ny;
		}
		
		
		
		System.out.println(x + ", " + y);
		
	}

}
