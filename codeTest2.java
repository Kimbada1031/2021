import java.util.Scanner;

public class codeTest2 {

	public static void main(String[] args) {
		
		int max = 0, max2 = 0, result = 0;
		
		int m, k, h;                      
		
		Scanner sc = new Scanner(System.in);
		
		h = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		
		int[] nums = new int[h];
		
		nums[0] = sc.nextInt();
		
		max = nums[0];
		
		for(int i = 1; i < h; i++) {
			nums[i] = sc.nextInt();
			for(int j = 1; j < nums.length; j++) {
				if(max <= nums[j]) {
					max2 = max;
					max = nums[j];
				}
			}
		}
		
		 while(true) {
			 for(int a = 0; a < k; a++) {
				 if(m == 0) {
					 break;
				 }
				 result += max;
				 m--;
			 }
			 if(m == 0) {
				 break;
			 }
			 result += max2;
			 m--;
		 }   
		
		
		System.out.println(result);
	}

}
