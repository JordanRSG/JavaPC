package javaPc;
public class StringExemplo {
	public static void main(String args[]){
		String str = "Isto � uma String do Java";
		String xyz = new String("Isto � uma String do Java");
		if( str == xyz ) System.out.println("IGUAL");
		else System.out.println("DIFERENTE");
		if( str.equals(xyz)){
			//MANEITA CORRETA DE SE COMPARAR O CONTE�DO DAS STRINGS
		}
		System.out.println("Tamanho da String:"+str.length());
		System.out.println("SubString:"+str.substring(0, 10));
		System.out.println("Caracter na posi��o 5:"+str.charAt(5));
	}
}
