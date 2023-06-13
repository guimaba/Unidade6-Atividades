import java.util.Scanner;

public class Uni6Exe02 {
    public Uni6Exe02() {
        Scanner teclado = new Scanner(System.in);
        double numeros[] = new double[12];

        ler(teclado, numeros);
        double valorMedia = calcularMedia(numeros);        
        System.out.println("Média: " + valorMedia);
        valoresMaiorQueMedia(numeros, valorMedia);

        teclado.close();
    }

    public void ler(Scanner teclado, double[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o elemento " + (i+1) + " vetor[" + (i+1) + "]: ");
            numeros[i] = teclado.nextDouble();
        }
    }

    public double calcularMedia(double[] numeros) {
        double valorMedia = 0;
        for (int i = 0; i < numeros.length; i++) {
            valorMedia += numeros[i];
          }
          valorMedia /= numeros.length;
          return valorMedia;
    }

    public void valoresMaiorQueMedia(double[] numeros, double valorMedia) {
        String valoresMM = ""; // Valores Maiores que a Média 
        for (int i = 0; i < numeros.length; i++) {
            if (valorMedia < numeros[i]) {
                valoresMM += numeros[i] + " ";
            }
          }
          System.out.println("Valoers maiores que a média: " + valoresMM);
    }

    public static void main(String[] args) throws Exception {
        new Uni6Exe02();
    }
}