import java.util.Scanner;

public class Uni6Exe03 {
    public Uni6Exe03() {
        Scanner teclado = new Scanner(System.in);
        double numeros[] = new double[12];

        ler(teclado, numeros);
        ajustarValores(numeros);
        escreverValoresAjustados(numeros);

        teclado.close();
    }

    public void ler(Scanner teclado, double[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o elemento " + (i+1) + " vetor[" + (i+1) + "]: ");
            numeros[i] = teclado.nextInt();
        }
    }

    public void ajustarValores(double[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                numeros[i] += numeros[i] *0.02;
            }
            else {
                numeros[i] += numeros[i] * 0.05;
            }
        }
    }

    public void escreverValoresAjustados(double[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + (i+1) + " vetor[" + (i+1) + "]: " + numeros[i]);
          }
    }

    public static void main(String[] args) throws Exception {
        new Uni6Exe03();
    }
}
