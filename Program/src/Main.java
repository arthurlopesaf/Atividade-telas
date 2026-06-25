void main() {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    //Array de 7 posições
    double[] temperatura = new double[7];

    double soma = 0;
    double media = 0;
    int contador = 0;

    IO.println("---- temperatura dos dias da semana ----");

    //Laço para preencher o array
    for (int i = 0; i < temperatura.length; i++) {

        IO.println("Digite a temperatura média do " + (i + 1) + "º dia da semana");
        temperatura[i] = scanner.nextDouble();
    }

    //Processamento
    for (int i = 0; i < temperatura.length; i++) {

        soma += temperatura[i];
    }

    media = soma / temperatura.length;

    //Contar se alguma temperatura é maior que a temperatura média geral
    for (int i = 0; i < temperatura.length; i++) {

        if (temperatura[i] > media) {
            contador++;
        }
    }

    //Saída de dados
    IO.println("\nA média geral das temperaturas é: " + media);
    IO.println(contador + " dias ficaram acima da temperatura media geral");

    //Encerramento
    IO.println("----------------------------------------------------");
    IO.println("Digite qualquer tecla para encerrar o programa");
    scanner.next();

    scanner.close();
}
