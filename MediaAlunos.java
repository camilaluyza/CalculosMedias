package Media;

import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int nota1, nota2, nota3;
		int media, i, numAluno = 0;
		
		for(i = 0; i < 2; i++) {
			
			
			numAluno++;
			System.out.println("Aluno" + numAluno + ", digite sua 1ª nota");
			nota1 = entrada.nextInt();
			
			System.out.println("Aluno" + numAluno + ", digite sua 2ª nota");
			nota2 = entrada.nextInt();
			
			System.err.println("Aluno" + numAluno + ", digite sua 3ª nota");
			nota3 = entrada.nextInt();
			
			media = (nota1 + nota2 + nota3) / 3;
			System.err.println("Amédia do aluno" + numAluno + " é " + media);
			
			if(media < 5) {
				System.err.println("Você está na final");
			} else if(media < 7) {
				System.err.println("Tem que entregar o trabalho");
			}else if(media < 7) {
				System.err.println("Tem que entregar o trabalho");
			}else if(media < 7) {
				System.err.println("Tem que entregar o trabalho");
			}
		}

	}

}
