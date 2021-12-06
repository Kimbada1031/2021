import java.util.Scanner;

public class ch4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] steps = {{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}};
		
		int cnt = 0, next_c = 0, next_r = 0;
		
		
		String map_r[] = {"a", "b", "c", "d", "e", "f", "g", "h"};
		
		String get_step;
		Scanner sc = new Scanner(System.in);
		get_step = sc.next();
		String step_r = get_step.substring(0 ,1);

		int step_c = Integer.parseInt(get_step.substring(1));
		
		for (int i = 0; i < steps.length; i++) {
			for (int j = 0; j < 8; j++) {
				if(map_r[j].equals(step_r)) {
					next_r = j+1;
				}
			}
			next_r += steps[i][0];
			next_c = step_c + steps[i][1];
			if(next_r >= 1 && next_r <= 9) {
				if(next_c >= 1 && next_c <= 9) {
					cnt += 1;
				}
			}
		}
		
		System.out.println(cnt);

	}

}
