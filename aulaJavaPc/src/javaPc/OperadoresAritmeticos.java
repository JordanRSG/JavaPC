package javaPc;
public class OperadoresAritmeticos {
	public static void main(String[] args) {
		int um = 3/2;	// divisão de inteiros gera um inteiro
		float umEmeio = (float) 3/2;	// ocorre promoção aritmética para float
		double xyz = umEmeio * um;	// ocorre promoção aritmética para float
		int resto = 7 % 2;	// resto = 1
		long l = 1000 + 4000;	
		double d = 1.0 - 0.01;	
		long var = 12345;
		String str = "O valor de var é " + var;
		String str2 = "O valor de var é " + Long.toString( var );
	}
}
