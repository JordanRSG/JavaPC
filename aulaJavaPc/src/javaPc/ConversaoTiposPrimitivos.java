package javaPc;
public class ConversaoTiposPrimitivos {
	public static void main(String[] args) {
		double d = 1.99d;
		int i = (int) d;	//i recebe o valor 1;
		short s = 15;
		long x = s;	// conversão widening
		long y = (long) s;	// não é necessário
	}
}
