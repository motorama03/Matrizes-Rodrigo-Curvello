import java.util.Scanner;

public class MatrizDois {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final int TAM = 5;
		float valor[][] = new float [TAM][TAM];
		float med1 = 0;
		float med2 = 0;
		float med3 = 0;
		float med4 = 0;
		float med5 = 0;
		float menorpreco1 = 0;
		float maiorpreco1 = 0;
		float menorpreco2 = 0;
		float maiorpreco2 = 0;
		float menorpreco3 = 0;
		float maiorpreco3 = 0;
		float menorpreco4 = 0;
		float maiorpreco4 = 0;
		float menorpreco5 = 0;
		float maiorpreco5 = 0;
		float mer1 = 0;
		float mer2 = 0;
		float mer3 = 0;
		float mer4 = 0;
		float mer5 = 0;
	/*	float mercaro = 0;
		float merbarato = 0; */
		
		
		for(int x = 0; x < TAM; x++){
			for(int y = 0; y < TAM; y++) {
				System.out.println("Informe o valor "+(y+1)+"º produto do "+(x+1)+"º mercado!");
				valor[x][y] = entrada.nextFloat();
				

				if(x==0 && y ==0) {
					maiorpreco1 = valor[x][y];
					menorpreco1 = valor[x][y];
				}
				if(y > 0 && x ==0) {
					if(valor[x][y] > maiorpreco1) {
						maiorpreco1 = valor[x][y];
				}
				if(valor[x][y] < menorpreco1) {
					menorpreco1 = valor[x][y];
					}
				}
				if(y==0 && x==1) {
					maiorpreco2 = valor[x][y];
					menorpreco2 = valor[x][y];
				}
				if(x == 1 && y > 0) {
					if(valor[x][y] > maiorpreco2) {
						maiorpreco2 = valor[x][y];
				}
					if(valor[x][y] < menorpreco2) {
						menorpreco2 = valor[x][y];
					}
				}
				if(y==0 && x ==2) {
					maiorpreco3 = valor[x][y];
					menorpreco3 = valor[x][y];
				}
				if(x == 2 && y > 0) {
					if(valor[x][y] > maiorpreco3) {
						maiorpreco3 = valor[x][y];
					}
					if(valor[x][y] < menorpreco3) {
						menorpreco3 = valor[x][y];
					}
				}
				if(y==0 && x ==3) {
					maiorpreco4 = valor[x][y];
					menorpreco4 = valor[x][y];
				}
				if(x == 3 && y > 0) {
					if(valor[x][y] > maiorpreco4) {
						maiorpreco4 = valor[x][y];
					}
					if(valor[x][y] < menorpreco4) {
						menorpreco4 = valor[x][y];
					}
				}
				if(y==0 && x ==4) {
					maiorpreco5 = valor[x][y];
					menorpreco5 = valor[x][y];
				}
				if(x == 4 && y > 0) {
					if(valor[x][y] > maiorpreco5) {
						maiorpreco5 = valor[x][y];
					}
					if(valor[x][y] < menorpreco5) {
						menorpreco5 = valor[x][y];
					}
				}
				
				if(x==0) {
					med1 = valor[x][y] + med1;
					mer1 = valor[x][y] + mer1;
				}
				else {
					if(x == 1){
						med2 = valor[x][y] + med2;
						mer2 = valor[x][y] + mer2;
				}
					else {
						if(x == 2) {
							med3 = valor[x][y] + med3;
							mer3 = valor[x][y] + mer3;
						}
						else {
							if(x == 3) {
								med4 = valor[x][y] + med4;
								mer4 = valor[x][y] + mer4;
							}
							else {
								if(x == 4) {
									med5 = valor[x][y] + med5;
									mer5 = valor[x][y] + mer5;
									if( y == 4){
									/*	mercaro = mer5;
										merbarato = mer5; */
									}
								}
							}
						}
					}
				}
			}
		}
		

	for(int x = 0; x < TAM; x++){
		System.out.println("Atenção para os produtos do "+(x+1)+"º mercado!");
		for(int y = 0; y < TAM; y++) {
			System.out.print(valor[x][y]+"  |  ");
		}
		System.out.println("");
	}
		
		System.out.print("A média de preço dos 1º produtos: ");
		System.out.println(" "+med1/5+" e a soma: "+mer1);
		System.out.print("A média de preço dos 2º produtos: ");
		System.out.println(" "+med2/5+" e a soma: "+mer2);
		System.out.print("A média de preço dos 3º produtos: ");
		System.out.println(" "+med3/5+" e a soma: "+mer3);
		System.out.print("A média de preço dos 4º produtos: ");
		System.out.println(" "+med4/5+" e a soma: "+mer4);
		System.out.print("A média de preço dos 5º produtos: ");
		System.out.println(" "+med5/5+" e a soma: "+mer5);
		System.out.println("O 1º produto mais barato custa "+menorpreco1+" e o mais caro custa "+maiorpreco1);
		System.out.println("O 2º produto mais barato custa "+menorpreco2+" e o mais caro custa "+maiorpreco2);
		System.out.println("O 3º produto mais barato custa "+menorpreco3+" e o mais caro custa "+maiorpreco3);
		System.out.println("O 4º produto mais barato custa "+menorpreco4+" e o mais caro custa "+maiorpreco4);
		System.out.println("O 5º produto mais barato custa "+menorpreco5+" e o mais caro custa "+maiorpreco5);
		
		entrada.close();

}

}