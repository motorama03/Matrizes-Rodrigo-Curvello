import java.util.Scanner;

public class MatrizTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos serçao avaliados?");
		int qntaluno = entrada.nextInt();
		String nomealuno[] = new String [qntaluno];
		float nota[][] = new float [qntaluno][qntaluno];
		float maiornota = 0;
		float menornota = 0;
		String alunotop = "Zé";
		String alunopobre = "Zé";
		float totalnota = 0;
		
		for(int x = 0; x < qntaluno; x++){
			System.out.println("Informe o primeiro nome do "+(x+1)+"º aluno!");
			nomealuno[x] = entrada.next();
			for(int y = 0; y < 2; y++){
				System.out.println("Informe a nota a "+(x+1)+"º do aluno "+nomealuno[x]);
				nota[x][y] = entrada.nextFloat();
				totalnota = totalnota + nota[x][y];
				
				if(x == 0 && y == 0){
					maiornota = nota[x][y];
					menornota = nota[x][y];
					alunotop = nomealuno[x];
					alunopobre = nomealuno[x];
				}
				else{
					if(nota[x][y] > maiornota){
						maiornota = nota[x][y];
						alunotop = nomealuno[x];
					}
					if(nota[x][y] < menornota){
						menornota = nota[x][y];
						alunopobre = nomealuno[x];
					}
				}
				if(x == qntaluno-1 && y == 1){
					totalnota = totalnota / qntaluno-1;
					for(int i = 0; i < qntaluno; i++){
						for(int u = 0; u < 2; u++){
							System.out.println("O aluno "+nomealuno[i]+" teve notas = "+nota[i][u]);
							if(u == 1){
								if(nota[i][0] + nota[i][1] >= totalnota){
									System.out.println("O aluno "+nomealuno[i]+" está com as notas acima da média da sala!");
								}
								else{
									System.out.println("O aluno "+nomealuno[i]+" está com as notas abaixo da média da sala!");
								}
							}
						}
					}
				}
			}
		}
		
		System.out.println("A maior nota tirada primeiro pertence a "+alunotop+" e a nota foi "+maiornota);
		System.out.println("A menor nota tirada primeiro pertence a "+alunopobre+" e a nota foi "+menornota);
		
		entrada.close();
		
	}

}
