import java.util.Scanner;
public class App {
public static void main(String[] args) {

    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double media;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite abaixo a Nota 1:");
    nota1 = teclado.nextDouble();
    System.out.println("Digite abaixo a Nota 2:");
    nota2 = teclado.nextDouble();
    System.out.println("Digite abaixo a Nota 3:");
    nota3 = teclado.nextDouble();
    System.out.println("Digite abaixo a Nota 4:");
    nota4 = teclado.nextDouble();

    media = (nota1 + nota2 + nota3 + nota4) / (4);

    System.out.print("O aluno ficou com a média: " + media);

    // A partir daqui, adicionei 2 condições para deixar o código um pouco mais completo.

    if (media <= 6.9) {
    System.out.println(" - Não atingiu a média necessária para aprovação"); }

    else {
    System.out.println(" - O Aluno(a) foi aprovado!"); }

    teclado.close();

    }
}