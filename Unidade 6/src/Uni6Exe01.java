import java.util.Scanner;

public class Uni6Exe01 {
    public Uni6Exe01() {
        Scanner teclado = new Scanner(System.in);
        int vetor[] = new int[10];

        ler(teclado, vetor);
        imprimirInverso(vetor);

        teclado.close();
    }

    public void ler(Scanner teclado, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o elemento " + (i+1) + " vetor[" + (i+1) + "]: ");
            vetor[i] = teclado.nextInt();
        }
    }

    public void imprimirInverso(int[] vetor) {
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println("vetor[" + (i+1) + "]: " + vetor[i]);
          }
    }

    public static void main(String[] args) throws Exception {
        new Uni6Exe01();
    }
}
