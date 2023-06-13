import java.util.Scanner;

public class Uni6Exe04 {
    public Uni6Exe04() {
        Scanner teclado = new Scanner(System.in);
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetorSOMA[] = new int[10];
        
        ler(teclado, vetor1, vetor2);
        somaVetores(vetor1, vetor2, vetorSOMA);
        escreverVetores(vetor1, vetor2, vetorSOMA);

        teclado.close();
    }

    public void ler(Scanner teclado, int[] vetor1, int[] vetor2) {
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Informe o elemento " + (i+1) + " vetor 1 [" + (i+1) + "]: ");
            vetor1[i] = teclado.nextInt();
        }
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Informe o elemento " + (i+1) + " vetor 2 [" + (i+1) + "]: ");
            vetor2[i] = teclado.nextInt();
        }
    }

    public void somaVetores(int[] vetor1, int[] vetor2, int[] vetorSOMA) {
        for (int i = 0; i < vetor1.length; i++) {
            vetorSOMA[i] = vetor1[i];
        }
        for (int i = 0; i < vetor1.length; i++) {
            vetorSOMA[i] += vetor2[i];
        }
    }

    public void escreverVetores (int[] vetor1, int[] vetor2, int[] vetorSOMA) {
        for (int i = 0; i < vetorSOMA.length; i++) {
            System.out.println("== Valores: " + (i+1) + " ======================");
            System.out.println("Soma dos vetores: elemento [" + (i+1) + "]: " + vetorSOMA[i]);
            System.out.println("Vetor 1 [" + (i+1) + "]: " + vetorSOMA[i]);
            System.out.println("Vetor 2 [" + (i+1) + "]: " + vetorSOMA[i]);
          }
    }

    public static void main(String[] args) throws Exception {
        new Uni6Exe04();
    }
}