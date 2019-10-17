package practice;

public class CrazyMath {

	public static int crazySum(int a, int b) {
		int sum = 0;
		if (a > 0) {
			for (int i = 1; i <= a; i++) {
				sum++;
			}
		} else if (a < 0) {
			for (int i = -1; i >= a; i--) {
				sum--;
			}
		}

		if (b > 0) {

			for (int i = 1; i <= b; i++) {
				sum++;
			}
		} else if (b < 0) {
			for (int i = -1; i >= b; i--) {
				sum--;
			}
		}
		return sum;
	}
	
	public static int crazySquare(int a) {
		int square = 0;
		if (a==0) {
			return 0;
		}
		if (a>0) {
			for (int i=1; i<=a; i++) {
				square +=a;
			}
			return square;
		}
		else if (a<0){
			int tmp = 0-a;
			for (int i=1; i<=tmp; i++) {
				square +=tmp;
			}
		} return 0-square;
	}

}
