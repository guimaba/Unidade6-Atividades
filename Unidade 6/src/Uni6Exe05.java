import java.util.Scanner;

public class Uni6Exe05 {
    public Uni6Exe05() {
        Scanner teclado = new Scanner(System.in);
        String respostasRapaz[] = new String[5];
        String respostasMoca[] = new String[5];
        
        ler(teclado, respostasRapaz, respostasMoca);
        afinidade(respostasRapaz, respostasMoca);
        teclado.close();
    }

    public void ler(Scanner teclado, String[] respostasRapaz, String[] respostasMoca) {
        String[] perguntas = {"Gosta de música sertaneja?", "Gosta de futebol?", "Gosta de seriados?", "Gosta de redes sociais?", "Gosta da Oktoberfest?"};
        for (int i = 0; i < respostasRapaz.length; i++) {
            System.out.println(perguntas[i]);
            System.out.println("Resposta "+ (i+1) + " do rapaz (SIM/NAO/IND): ");
            respostasRapaz[i] = teclado.next();
        }
        System.out.println("\n=========================================\n");
        for (int i = 0; i < respostasMoca.length; i++) {
            System.out.println(perguntas[i]);
            System.out.println("Resposta "+ (i+1) + " da moça (SIM/NAO/IND): ");
            respostasMoca[i] = teclado.next();
        }
    }

    public void afinidade(String[] respostasRapaz, String[] respostasMoca) {
        int pontosAfinidade = 0;
        for (int i = 0; i < respostasRapaz.length; i++) {
            switch(respostasRapaz[i].toUpperCase()){
                case "SIM":
                if(respostasMoca[i].toUpperCase().equals("SIM")) {
                    pontosAfinidade += 3;
                }
                if(respostasMoca[i].toUpperCase().equals("IND")) {
                    pontosAfinidade += 1;
                }
                if(respostasMoca[i].toUpperCase().equals("NAO")) {
                    pontosAfinidade -= 2;
                }
                break;
                case "NAO":
                if(respostasMoca[i].toUpperCase().equals("SIM")) {
                    pontosAfinidade -= 2;
                }
                if(respostasMoca[i].toUpperCase().equals("IND")) {
                    pontosAfinidade += 1;
                }
                if(respostasMoca[i].toUpperCase().equals("NAO")) {
                    pontosAfinidade += 3;
                }
                break; 
                case "IND":
                if(respostasMoca[i].toUpperCase().equals("SIM")) {
                    pontosAfinidade += 1;
                }
                if(respostasMoca[i].toUpperCase().equals("IND")) {
                    pontosAfinidade += 3;
                }
                if(respostasMoca[i].toUpperCase().equals("NAO")) {
                    pontosAfinidade += 1;
                }
                break;
            }
        }
        System.out.println("=========================================");
        System.out.println("Afinidade: ");
        if (pontosAfinidade == 15) {
        System.out.println(pontosAfinidade + " | CASEM!");
        }
        else if (pontosAfinidade >= 10 && pontosAfinidade <= 14) {
            System.out.println(pontosAfinidade + " | Vocês tem muita coisa em comum!");
        }
        else if (pontosAfinidade >= 5 && pontosAfinidade <= 9) {
            System.out.println(pontosAfinidade + " | Talvez não dê certo :(");
        }
        else if (pontosAfinidade >= 0 && pontosAfinidade <= 4) {
            System.out.println(pontosAfinidade + " | Vale um encontro.");
        }
        else if (pontosAfinidade <= (-1) && pontosAfinidade >= (-9)) {
            System.out.println(pontosAfinidade + " | Melhor não perder tempo.");
        }
        else if (pontosAfinidade == (-10)) {
            System.out.println(pontosAfinidade + " | Vocês se odeiam!");
        }
        System.out.println("=========================================");
    }

    public static void main(String[] args) throws Exception {
        new Uni6Exe05();
    }
}