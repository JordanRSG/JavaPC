package javaPc;
public class ControleFluxoPrograma {
	public static void main(String[] args) {
		//clausula if
		int idade = 20;
		if( idade <= 12){
			System.out.println("Crian�a");
		}
		if( idade > 12 && idade <= 19){
			System.out.println("Adolescente");
		}
		if( idade > 19 && idade <= 60){
			System.out.println("Adulto");
		}
		if( idade > 60){
			System.out.println("Idoso");
		}
		//clausula if/else
		int idade2 = 20;
		if( idade2 <= 12){
			System.out.println("Crian�a");
		}else if( idade2 > 12 && idade2 <= 19){
			System.out.println("Adolescente");
		}else if( idade2 > 19 && idade2 <= 60){
			System.out.println("Adulto");
		}else {
			System.out.println("Idoso");
		}
		//clausula switch
		int numero = 1;
		switch( numero ){
			case 1:
				System.out.println("UM");
				break;
			case 2:
				System.out.println("DOIS");
				break;
			case 3:
				System.out.println("TRES");
				break;
			default:
				System.out.println("NENHUM");
				break;
		}
		//la�o while
		int i = 0;
		//la�o while() com bloco de c�digo definido
		while(i < 10){
			System.out.println("Linha: "+i);
			i++;
		}
		//la�o do/while
		int i2 = 0;
		//la�o do/while() com bloco de c�digo definido
		do {
			System.out.println("Linha: "+i2);
			i2++;
		} while(i2 < 10);
		//la�o for
		for(int i3 = 0; i3 < 10; i3++){
			System.out.println("Linha: "+ i3);
		}
		//la�o for avan�ado
		for(String s : args){
			System.out.println("Argumento: "+ s);
		}
		List lista = new ArrayList();
		//adiciona itens � lista
		for(String s2 : lista){
			System.out.println("Argumento: "+ s2);
		}
		//clausula break
		char letras[] = {'A','B','C','D','E'};
		int i4;
		for(i4 = 0; i4<letras.length; i4++){
			if( letras[i4] == 'C'){
				break;
			}
		}
		System.out.println("�ltimo �ndice: "+i);
		//clausula break rotulada
		int j = 0, i5 = 0;
		principal1: while(true){
			for( i5 = 0; i5<1000; i5++){
				if(j == 10 && i5 == 100)
					break principal1;
			}
			j++;
		}
		//clausula continue
		char letras1[] = {'B','X','R','A','S','I','L'};
		int i6;
		for(i6 = 0; i6<letras.length; i6++){
			if( letras1[i6] == 'X'){
				continue;
			}
			System.out.print(letras1[i]);
		}
		//clausula continue rotulada
		int i7 = 0, j1 = 0;
		principal2: for(j1=1;j1<10;j1++){
			for(i7=1; i7<10; i7++){
				if((i7%j1) == 0){
					System.out.println("i="+i+" j="+j);
					continue principal2;
				}
			}
			j++;
		}
	}
}