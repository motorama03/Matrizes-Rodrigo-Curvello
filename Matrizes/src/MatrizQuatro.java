import java.util.Scanner;

public class MatrizQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos atletas saltam?");
		int qntatleta = entrada.nextInt();
		float saltos[][] = new float [qntatleta][5];
		float salto = 0;
		float med = 0;
		float campeao = 0;
		float perdedor = 0;
		System.out.println("Por atleta são permitidos 5 saltos, informe a distancia de cada!");
		
		for(int x = 0; x < qntatleta; x++){
			salto = 0;
			for(int i = 0; i < 5; i++){
				System.out.println("Informe o "+(i+1)+"º salto do "+(x+1)+" atleta");
				saltos[x][i] = entrada.nextFloat();
				salto = saltos[x][i]+salto;
				//System.out.println(med);
				if(x == 0 && i == 4){
					med = (salto)/5;
					campeao = med;
					perdedor = med;
					System.out.println("A média até o último pulo foi de "+med);
				}
					else{
						if(x > 0 && i == 4){
							med = (salto)/5;
							if(campeao < med){
								campeao = med;
							}
							if(perdedor > med){
								perdedor = med;
							}
						System.out.println("A média até o último pulo foi de "+med);
						}
					}
			}
		}
		
		System.out.println("A media do perdedor foi de "+perdedor);
		System.out.println("A media do vencedor foi de "+campeao);
		entrada.close();
		
	}

}
