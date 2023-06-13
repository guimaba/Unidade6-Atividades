import java.util.Scanner;

public class Uni6Exe06 {
    public Uni6Exe06() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tam = teclado.nextInt();
        double vetor[] = new double[tam];

        ler(teclado, vetor);
        encontraCadastro(teclado, vetor);

        teclado.close();
    }

    public void ler(Scanner teclado, double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento "+ (i+1) + " do vetor: ");
            vetor[i] = teclado.nextDouble();
        }
    }

    public void encontraCadastro (Scanner teclado, double vetor[]) {
        boolean sim = false;
        System.out.println("Informe um valor real: ");
        double informeValor = teclado.nextDouble();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == informeValor) {
                System.out.println("O valor informado está contigo no vetor.");
                sim = true;
                break;
            }
        }
        if (sim == false) {
            System.out.println("O valor informado não está contigo no vetor.");
        }
    }

    public static void main(String[] args) throws Exception {
        new Uni6Exe06();
    }
}