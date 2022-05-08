import java.util.Scanner;

public class teste02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int counter = 0;
		
		for (int i = 0; i < 5; i++)
		{
			System.out.printf("Digite o tempo de chegada do aluno %d: ", i+1);
			int time = input.nextInt();
			if (time > 0) {
				counter++;
			}
	}
		int limit = 3;
		if (counter >= limit) {
			System.out.println("Aula cancelada.");
		} else {
			System.out.println("Aula normal.");
		}
		input.close();
}
}
