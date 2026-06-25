import java.util.Scanner;
import java.util.Locale;

class Main {
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {

        int opcao = -1;

        //Loop até o usuario digitar 0 para sair do programa
        while (opcao != 0) {

            //          MENU DE OPÇÕES
            System.out.println("\n  ------ MENU ------");
            for (int i = 1; i <= 7; i++) {
                System.out.println(i + " -> Atividade " + i);
            }
            System.out.println("0 -> Sair");

            opcao = LerInteiro("");

            //Atividade selecionada pelo usuário
            switch (opcao) {

                case 0:
                    System.out.println("Saindo do programa .....");
                    break;

                case 1:
                    Tabuada(LerInteiro("Digite um número inteiro para saber sua tabuada"));
                    break;

                case 2:
                    System.out.println("Digite um destes caracteres para sua linha. Exemplo: (-, *, =)");
                    char simboloEscolhido = scanner.next().charAt(0);

                    int numDeVezesEscolhido = LerInteiro("Digite a quantidade de vezes que esse caractere irá se repetir");

                    DesenharLinha(simboloEscolhido, numDeVezesEscolhido);
                    break;

                case 3:

                    break;

                default:
                    System.out.println("Número fora do intervalo\n");
                    break;
            }
        }
    }

    //Metodo para ler inteiro com segurança
    static int LerInteiro(String mensagem) {

        int numero;
        System.out.println(mensagem);

        while (true) {

            if (scanner.hasNextInt()) {

                numero = scanner.nextInt();
                return numero;
            } else {
                System.out.println("Esse número não é inteiro");
                scanner.next();
            }
        }
    }

    //Metodo para a atividade 1
    static void Tabuada(int numero) {

        System.out.println("---- Tabuada do " + numero + " ----");

        for (int i = 1; i <= 10; i++) {

            System.out.println("     " + numero + " x " + i + " = " + numero * i);
        }

        Finalizar("Digite qualquer tecla para finalizar");
    }


    //Metodo para a atividade 2
    static void DesenharLinha(char simbolo, int numDeVezes) {

        if (simbolo != '-' && simbolo != '*' && simbolo != '=') {

            System.out.println("Caracter inválido use: -, * ou =");
            return;
        }

        for (int i = 0; i < numDeVezes; i++) {

            System.out.print(simbolo);
        }

        Finalizar("\nDigite qualquer tecla para finalizar");
    }

    //Metodo para a atividade 3

    //Metodo para finalizar com qualquer tecla
    static void Finalizar(String mensagem) {

        System.out.println(mensagem);
        scanner.next();
    }
}