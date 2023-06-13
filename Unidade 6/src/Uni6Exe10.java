import java.util.Scanner;

public class Uni6Exe10 {
    public Uni6Exe10() {
        Scanner teclado = new Scanner(System.in);
        
        int[] vetor = new int[50];
        int posicaoAtual = 0;

        opcoesMetodo(teclado, vetor, posicaoAtual);

        teclado.close();
    }

    private void opcoesMetodo(Scanner teclado, int[] vetor, int posicaoAtual) {
        int opcao;
        do {
            System.out.println("\n==========================");
            System.out.println("| Escolha uma das opções |");
            System.out.println("| 1. Incluir Valor.\t |");
            System.out.println("| 2. Pesquisar Valor.\t |");
            System.out.println("| 3. Alterar Valor.\t |");
            System.out.println("| 4. Excluir Valor.\t |");
            System.out.println("| 5. Mostrar Valores.\t |");
            System.out.println("| 6. Ordenar Valores.\t |");
            System.out.println("| 7. Inverter Valores.\t |");
            System.out.println("| 8. Sair.\t\t |");
            System.out.println("==========================");
            System.out.print("Opção: ");
            opcao = teclado.nextInt();
            System.out.println("==========================");
            switch (opcao) {
                case 1:
                    posicaoAtual = incluirValor(teclado, vetor, posicaoAtual);
                    break;
                case 2:
                    pesquisarValor(teclado, vetor, posicaoAtual);
                    break;
                case 3:
                    alterarValor(teclado, vetor, posicaoAtual);
                    break;
                case 4:
                    posicaoAtual = excluirValor(teclado, vetor, posicaoAtual);
                    break;
                case 5:
                    mostrarValores(teclado, vetor);
                    break;
                case 6:
                    ordenarValores(teclado, vetor);
                    break;
                case 7:
                    inverterValores(vetor);
                    break;
                case 8:
                    System.out.println("\nFinalizando Sistema...");
                    break;
                default:
                    System.out.print("Opção Inválida!");
                    break;
            }
        } while (opcao != 8);
    }

    // CASO 1
    public int incluirValor(Scanner teclado, int[] vetor, int posicaoAtual) {
        if (posicaoAtual != vetor.length) {
            System.out.print("Digite um número: ");
            int num = teclado.nextInt();
            vetor[posicaoAtual] = num;
        }
        else {
            System.out.println("O vetor já está cheio!");
        }
        posicaoAtual++;
        return posicaoAtual;
    }

    // CASO 2
    public int pesquisarValor(Scanner teclado, int[] vetor, int posicaoAtual) {
        System.out.print("Digite o número: ");
        int num = teclado.nextInt();
        int posicaoEncontrada = -1;
        boolean achou = false;
        for (int i = 0; i < posicaoAtual; i++) {
            if (vetor[i] == num) {
                achou = true;
                posicaoEncontrada = posicaoAtual;
                break;
            }
        }
        if (achou) {
            System.out.println("O número desejado existe! Na posição: " + posicaoAtual);
        } else {
            System.out.println("O número desejado nao existe.");
        }
        return posicaoEncontrada;
    }

    // CASO 3
    public void alterarValor(Scanner teclado, int[] vetor, int posicaoAtual) {

        if (pesquisarValor(teclado, vetor, posicaoAtual) != -1) {
            System.out.print("Digite o novo número: ");
            vetor[pesquisarValor(teclado, vetor, posicaoAtual)] = teclado.nextInt();
        } else {
            System.out.println("Não foi possível alterar.");
        }
    }

    // CASO 4
    public int excluirValor(Scanner teclado, int[] vetor, int posicaoAtual) {
        System.out.print("Digite o valor para excluir: ");
        int num = teclado.nextInt();
        boolean excluiu= false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == num) {
            vetor[i] = 0;
            for (int x = (i+1); x < vetor.length; x++) {
                vetor[x-1] = vetor[x];
            }
            excluiu = true;
            break;
            }
        }
        if (excluiu) {
            System.out.println("Número excluído com sucesso!");
        }
        else {
            System.out.println("Número não pôde ser excluído.");
        }
        posicaoAtual--;
        return posicaoAtual;
    }

    // CASO 5
    public void mostrarValores(Scanner teclado, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
            System.out.println("Posição: [" + (i) + "]: " + vetor[i]);
            }
        }
    }

    // CASO 6
    public void ordenarValores(Scanner teclado, int[] vetor) {
        int numTemporario = 0;
        int tamVetorPreenchido = 0;
        for (int z = 0; z < vetor.length; z++) {
            if (vetor[z] != 0) {
                tamVetorPreenchido++;
            }
            else {
                break;
            }
        }
        for (int i = 0; i < tamVetorPreenchido; i++) {
                for (int x = 0; x < tamVetorPreenchido-i-1; x++) {
                    if (vetor[x] > vetor[x+1]) {
                        numTemporario = vetor[x+1];
                        vetor[x+1] = vetor[x];
                        vetor[x] = numTemporario;
                    }
                }
        }
        System.out.println("Vetor ordenado com sucesso!");
        mostrarValores(null, vetor);
    }

    // CASO 7
    public void inverterValores(int[] vetor) {
    
        int numTemporario = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                for (int x = 0; x <= i; x++) {
                    numTemporario = vetor[i];
                    vetor[i] = vetor[x];
                    vetor[x] = numTemporario;
                }
            }
        }
        System.out.println("Vetor invertido com sucesso!");
        mostrarValores(null, vetor);
    }

    // CASO 8
    // Sair

    public static void main(String[] args) throws Exception {
        new Uni6Exe10();
    }
}