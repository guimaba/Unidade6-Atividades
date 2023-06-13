import java.util.Scanner;

public class Uni6Exe09 {
    public Uni6Exe09() {
        Scanner teclado = new Scanner(System.in);
        double vetorSexo[] = new double[3];
        double vetorNota[] = new double[3];
        double vetorIdade[] = new double[3];
        System.out.println("Preencha os 20 elementos do vetor: \n");
        ler(teclado, vetorSexo, vetorNota, vetorIdade);
        double notaMediaCinema = mediaCinema(vetorNota);
        double notaMediaHomens = mediaHomens(vetorNota, vetorSexo);
        double notaMulherMJ = mulherMJ(vetorNota, vetorSexo, vetorIdade);
        double qtdMulheresMC = mulheresMaisCinquenta(vetorNota, vetorSexo, vetorIdade);

        System.out.println("Média do cinema: " + notaMediaCinema);
        System.out.println("Média dos Homens: " + notaMediaHomens);
        System.out.println("Nota da mulher mais Jovem: " + notaMulherMJ);
        System.out.println("Quantidade de mulheres com mais de 50 que deram nota acima da média: " + qtdMulheresMC);

        teclado.close();
    }

    public void ler(Scanner teclado, double vetorSexo[], double vetorNota[], double vetorIdade[]) {
        boolean valoresCorretos = true;
        do {
        for (int i = 0; i < vetorSexo.length; i++) {

            System.out.println("Pessoa: " + (i + 1));
            System.out.println("Informe o sexo: (1 = feminino | 2 = masculino)");
            vetorSexo[i] = teclado.nextDouble();
            if(vetorSexo[i] != 1 || vetorSexo[i] != 2) {
                System.out.println("Valor inválido! Faça novamente.");
                i--;
            }
            else {
            System.out.println("Informe a nota do filme: (0 a 10)");
            vetorNota[i] = teclado.nextDouble();
            if(vetorNota[i] > 10 || vetorNota[i] < 0) {
                System.out.println("Valor inválido! Faça novamente.");
                i--;
            }
            else {
            System.out.println("Informe a idade: ");
            vetorIdade[i] = teclado.nextDouble();
            }
        }
        }
        } while (valoresCorretos);
    }

    public double mediaCinema(double[] vetorNota) {
        double nota = 0;
        for (int i = 0; i < vetorNota.length; i++) {
            nota += vetorNota[i];
        }
        nota /= vetorNota.length;
        return nota;
    }

    public double mediaHomens(double[] vetorNota, double[] vetorSexo) {
        double nota = 0;
        int qtdH = 0;
        for (int i = 0; i < vetorNota.length; i++) {
            if (vetorSexo[i] == 2) {
                nota += vetorNota[i];
                qtdH++;
            }
        }
        nota /= qtdH;
        return nota;
    }

    public double mulherMJ(double[] vetorNota, double[] vetorSexo, double[] vetorIdade) {
        int maisJovem = 1000;
        int nota = 0;
        for (int i = 0; i < vetorIdade.length; i++) {
            if (vetorSexo[i] == 1) {
                if (vetorIdade[i] < maisJovem) {
                    nota += vetorNota[i];
                }
            }
        }
        return nota;
    }

    public double mulheresMaisCinquenta(double[] vetorNota, double[] vetorSexo, double[] vetorIdade) {
        int maisCinquenta = 0;
        double nota = mediaCinema(vetorNota);
        for (int i = 0; i < vetorIdade.length; i++) {
            if (vetorSexo[i] == 1) {
                if (vetorIdade[i] > 50) {
                    if (vetorNota[i] > nota) {
                        maisCinquenta++;
                    }
                }
            }
        }
        return maisCinquenta;
    }

    public static void main(String[] args) throws Exception {
        new Uni6Exe09();
    }
}