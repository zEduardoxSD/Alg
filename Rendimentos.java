final double VALOR_INICIAL = 10000.0;
final double TAXA_INICIAL = 6.0;
final double PASSO_TAXA = 0.5;
final int NUM_TAXAS = 5;
final int NUM_ANOS = 4;

void main() {
    double[] taxa = new double[NUM_TAXAS];
    double[] valor = new double[NUM_TAXAS];

    IO.print(" Ano");
    for (int i = 0; i < NUM_TAXAS; i++) {
        valor[i] = VALOR_INICIAL;
        taxa[i] = (TAXA_INICIAL + i * PASSO_TAXA) / 100.0;
        IO.print(String.format("%9.1f%%", 100.0 * taxa[i]));
    }
    IO.println();

    for (int ano = 1; ano <= NUM_ANOS; ano++) {
        IO.print(String.format("%4d", ano));
        for (int i = 0; i < NUM_TAXAS; i++) {
            valor[i] += valor[i] * taxa[i];
            IO.print(String.format("%10.2f", valor[i]));
        }
        IO.println();
    }
}