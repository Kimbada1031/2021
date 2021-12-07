import java.util.Scanner;
public class c4_3 {
	static int get_d;
	public static void turn_left() {
		get_d -= 1;
		if(get_d == -1) {
			get_d = 3;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m, x, y;
		int dx[] = {-1, 0, 1, 0};
		int dy[] = {0, 1, 0, -1};
		int cnt = 0, turn_time = 0;
		int nx = 0, ny = 0;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		get_d = sc.nextInt();
		
		int[][] get_map = new int[n][m];
		int[][] d = new int[n][m];
		
		d[x][y] = 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				get_map[i][j] = sc.nextInt();
				d[i][j] = 0;
			}
		}
		
		while(true) {
			turn_left();
			nx = x + dx[get_d];
			ny = y + dx[get_d];
			
			if(get_map[nx][ny] == 0 && d[nx][ny] == 0) {
				d[nx][ny] = 1;
				x = nx;
				y = ny;
				cnt += 1;
				turn_time = 0;
				continue;
			} else {
				turn_time += 1;
			}
			
			if(turn_time == 4) {
				nx = x - dx[get_d];
				ny = y - dy[get_d];
				
				if(get_map[nx][ny] == 0) {
					x = nx;
					y = ny;
				} else {
					break;
				}
				turn_time = 0;
			}
		}
		System.out.println(cnt);
	}

}
