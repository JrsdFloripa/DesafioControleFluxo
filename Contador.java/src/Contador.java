import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número no intervalo entre 1 e 30:");
        int num1 = scanner.nextInt();

        System.out.println("Digite outro número no intervalo entre 1 e 30:");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            try {
                throw new ParametroInvalidoException
                ("O primeiro número deve ser menor que o segundo\n Por favor repita o processo.");
            } catch (ParametroInvalidoException e) {
                System.out.println(e.getMessage());
            }
        } else {
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        }
    }
}

class ParametroInvalidoException extends Exception {
    public ParametroInvalidoException(String message) {
        super(message);
    }
}

    

    


        

    

