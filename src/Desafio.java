import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Qual o tipo de cofre deseja abrir? Escreva: Digital ou Físico");
        String tipoCofre = leitura.next();
        if (tipoCofre.equalsIgnoreCase("Digital")) {
            CofreDigital newCofre = new CofreDigital(tipoCofre, "Senha", "1234");
            System.out.println("Seu tipo de cofre é " + newCofre.tipo);
            System.out.println("O método de abertura desse cofre é através de " + newCofre.metodoAbertura);
            System.out.println("Digite a senha do cofre: ");
            String senhaDigitada = leitura.next();
            if (senhaDigitada.equalsIgnoreCase(newCofre.senha)) {
                System.out.println("Cofre Aberto");
            } else {
                System.out.println("Senha não confere! ");
            }
        } else if (tipoCofre.equalsIgnoreCase("Fisico")) {
            CofreFisico newCofre2 = new CofreFisico(tipoCofre, "Chave");
            System.out.println("Seu tipo de cofre é " + newCofre2.tipo);
            System.out.println("O método de abertura desse cofre é através de " + newCofre2.metodoAbertura);
        } else {
            System.out.println("Não digitou um tipo de cofre válido! ");
        }


    }
}