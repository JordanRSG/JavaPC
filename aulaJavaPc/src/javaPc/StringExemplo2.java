package javaPc;

public class StringExemplo2 {
	public static void main(String args[]){
		String str = "Isto é uma String do Java";
		// O método split quebra a String e várias outras,
		// pelo separador desejado
		String[] palavras = str.split("");
		int i = str.indexOf("uma"); //retorna o índice da palavra na String
		if( str.startsWith("Olá")||str.endsWith("Mundo!")){
			// testa o começo e o fim da String - retorna boolean
		}
		str = str.trim(); // elimina os espaços em branco no início e fim
		str = str.replace('a', '@'); // substitui os caracteres
		//substitui uma palavra (usa expressões regulares)
		str = str.replaceAll("String", "Cadeia de caracteres");
	}
}
