import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = isInt(terminal);
        
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = isInt(terminal);

        try {
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}	

        terminal.close();
	}
    // Tratativa case: parametroUm >= parametroDois
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois)
        throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;
        for (int i = 1; i < (contagem + 1); i++) {
            System.out.println("Imprimindo o número " + i);            
        }
	}
    // Tratativa case: Números Double
    static int isInt(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
                
            } catch (InputMismatchException e) {
                System.out.println("Número inválido, digite um número inteiro");
                scanner.nextLine();
            }            
        }
    }
}