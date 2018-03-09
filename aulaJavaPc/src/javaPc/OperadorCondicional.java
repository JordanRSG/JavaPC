package javaPc;
public class OperadorCondicional {
	public static void main(String[] args) {
		int x = 10;
		int y = (x > 10) ? x : x + 1;
		int x1 = 10;
		int y2;
		if(x > 10){
			y = x;
		}else {
			y = x + 1;
		}
	}
}
