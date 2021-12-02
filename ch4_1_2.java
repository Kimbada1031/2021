import java.util.Scanner;

public class ch4_1_2 {

	public static void main(String[] args) {
		int h1, h2, h3, cnt = 0;
		String get_hour;
		
		Scanner sc = new Scanner(System.in);
		
		h1 = sc.nextInt();
		
		for(int i = 0; i < h1+1; i++) {
			for(int j = 0; j < 60; j++) {
				for(int k = 0; k < 60; k++) {
					get_hour = String.valueOf(i) + String.valueOf(j) + String.valueOf(k);
					if(get_hour.contains("3")) {
						cnt++;
					}
				}
			}
		}
		
		System.out.println(cnt);

	}

}
