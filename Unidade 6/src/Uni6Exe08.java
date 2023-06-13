import java.util.Scanner;

public class Uni6Exe08 {
    public Uni6Exe08() {
        Scanner teclado = new Scanner(System.in);

        float[] vetor = ler(teclado);
        valorUnico(vetor);

        teclado.close();
    }

    private float[] ler(Scanner teclado) {
        int quantidade;
        do {
            System.out.println("Informe a quantidade de posições (sendo MENOR ou IGUAL a 20): \n");
            quantidade = teclado.nextInt();
        } while (quantidade < 0 || quantidade > 20);

        float[] vetor = new float[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento " + (i + 1) + " do vetor: ");
            vetor[i] = teclado.nextFloat();
        }
        return vetor;
    }

    private void valorUnico(float[] vetor) {
        int posicao = 0;
        float[] vetorValorUnico = new float[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            boolean existe = false;
            for (int n = 0; n < i; n++) {
                if (vetor[i] == vetor[n] && i != n) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                vetorValorUnico[posicao] = vetor[i];
                posicao++;
            }
        }
        for (int i = 0; i < vetorValorUnico.length; i++) {
            if (vetorValorUnico[i] != 0.0) {
            System.out.print("Vetor Único: " + vetorValorUnico[i] + " - ");
            int quantidade = 0;
            for (int j = 0; j < vetor.length; j++) {
                if (vetorValorUnico[i] == vetor[j]) {
                    quantidade++;
                }
            }
            System.out.println(quantidade);
            }
        }

    }

    public static void main(String[] args) throws Exception {
        new Uni6Exe08();
    }
}