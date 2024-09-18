import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        int ano, atual;
        atual = 2024;
        System.out.println("Digite seu ano de nascimento: ");
        ano = leitor.nextInt();
        if (atual >= ano) {
            System.out.printf("Idade: %d%n", atual - ano);
        }else{
            System.out.println("Valor inserido é inválido!");
        }
    }
}
