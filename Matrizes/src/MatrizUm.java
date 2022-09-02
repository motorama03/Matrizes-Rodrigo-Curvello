
import java.util.Scanner;

public class MatrizUm {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int diaP = 0;
		int diaS = 0;
		int countpar = 0;
		int countimp = 0;
		float medelemento = 0;
		int somaelemento = 0;
		int menorelemento = 0;
		int maiorelemento = 0;
		//decimal format df = new decimal format;
		System.out.println("Informe um número impar inteiro entre 3 e 11");
		int numimp = entrada.nextInt();
		
		while(((numimp > 11 || numimp < 3 || numimp % 2 == 0))){
			System.out.println("número inválido!");
			numimp = entrada.nextInt();
		}

		int aux[][]= new int [numimp][numimp];
		int vet[][] = new int [numimp][numimp]; 
		for(int y = 0; y < numimp; y++){
			for(int x = 0; x < numimp; x++){
				System.out.println("Informe o "+(x+1)+"º valor do vetor");
				vet[y][x] = entrada.nextInt();
				somaelemento = somaelemento + vet[y][x];
				if(x == 0){
					menorelemento = vet[y][x];
					maiorelemento = vet[y][x];
				}
				if(menorelemento > vet[y][x]){
					menorelemento = vet[y][x];
				}
				if(maiorelemento < vet[y][x]){
					maiorelemento = vet[y][x];
				}
				if(x == numimp-1){
					medelemento = somaelemento / numimp;
				}
				if(vet[y][x] % 2 == 0 ){
					countpar = countpar + 1;
				}
				if(vet[y][x] % 3 == 0 ){
					countimp = countimp + 1;
				}
			}
		}
		for(int y = 0; y < numimp; y++){
			for(int x = 0; x < numimp; x++){
				System.out.print(vet[y][x]+" || ");
			}
			System.out.println(" ");
		}
		
		for(int x = 0; x < numimp; x++){
			for(int y = 0; y < numimp; y++){
				if( x == y){
					diaP = diaP + vet[x][y];
				}
			}
		}
		
		for(int x = numimp-1; x >= 0; x--){
			for(int y = numimp-1; y >= 0; y--){
				aux[x][y] =  vet[y][x];
			}
		}
		
		/*for(int x = 0; x < numimp; x++){
			for(int y = 0; y < numimp; y++){
				if( x == y){
					vet[x][y] = aux[x][y];
				}
			}
		}*/	
			
		for(int x = 0; x < numimp; x++){
			for(int y = 0; y < numimp; y++){
				System.out.print(aux[x][y]+" || ");
				//diaS = diaS + vet[x][y];
			}
			System.out.println(" ");
		}
		
		System.out.println("A média entre os valores é "+medelemento);
		System.out.println("O maior elemento é "+maiorelemento+" e o menor é "+menorelemento);
		System.out.println("Diagonal principal soma: "+diaP);
		System.out.println("Diagonal secundaria soma: "+diaS);
		
		entrada.close();
	}
}
	

