import java.util.Scanner;
import java.util.Random;

public class MatrizCinco {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Informe quantas cartelas você deseja");
		int N = entrada.nextInt();
	
		Random rand = new Random();
	
		int [] iTotal = new int [N];
	
	    int [][]vet = new int[N][6];
		int [][]gabarito = new int[N][6];
		boolean[][]acerto = new boolean[N][6];
	
		for(int i = 0;i<N;i++) {
			for(int j = 0; j < 6;j++) {
				gabarito[i][j] = rand.nextInt(60);
			}
		}
		for(int i = 0;i<N;i++) {
			for(int j = 0; j < 6;j++) {
				System.out.print("Informe o número "+(j+1)+" da cartela "+(i+1)+": ");
				vet[i][j] =  entrada.nextInt();
			}
		}
		for(int i = 0;i<N;i++) {
			for(int j = 0; j < 6;j++) {
				if(vet[i][j] == gabarito[i][j]) {
					acerto[i][j] = true;
	
				}
			}
		}	
		System.out.println("\n");
		System.out.print("Sua cartela: ");
		for(int i = 0; i < N;i++) {
			System.out.println("");
			for(int j = 0; j < 6;j++) {
				System.out.print(vet[i][j]+" ");
	
			}	
	
		}
		System.out.println("\n");
		System.out.print("Cartela gabarito: ");
		for(int i = 0; i < N;i++) {
			System.out.println("");
			for(int j = 0; j < 6;j++) {
				System.out.print(gabarito[i][j]+" ");
	
			}	
	
		}
		System.out.println("\n");
		for(int i = 0; i < N;i++) {
			for(int j = 0; j < 6;j++) {
				if(acerto[i][j]) {
					System.out.println("Cartela "+(i+1)+" número: "+(j+1)+" acertou!");
					iTotal[i]++;
				}else {
					System.out.println("Cartela "+(i+1)+" número: "+(j+1)+" errou!");;
				}
				if(j==5) {
					System.out.println("Acertos da cartela: "+(i+1)+": "+iTotal[i]+"\n");
				}
			}
		}
		entrada.close();
	}
}