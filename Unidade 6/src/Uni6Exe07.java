import java.util.Scanner;

public class Uni6Exe07 {
    public Uni6Exe07() {
        Scanner teclado = new Scanner(System.in);
        int vetor[] = new int[3];
        System.out.println("Preencha os 20 elementos do vetor: \n");
        ler(teclado, vetor);
        System.out.println(vetor);
        teclado.close();
    }

    public void ler(Scanner teclado, int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento " + (i + 1) + " do vetor: ");
            int num = teclado.nextInt();
            for (int n = 0; n <= i; n++) {
                if (num != vetor[n]) {
                    vetor[i] = num;
                } else {
                    System.out.println("Valor já contido, digite outro");
                    i--;
                    break;
                }
                
            }
        }
    }

    public void organizar(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
        

        
        }
    }

    public static void main(String[] args) throws Exception {
        new Uni6Exe07();
    }
}