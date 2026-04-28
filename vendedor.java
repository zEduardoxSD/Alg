void main(){
    Double Salario = 2000.00;
    String entrada;
    Double vendas, avaliacao;
    entrada = IO.readln("Entre com as vendas: ");
    vendas = Double.parseDouble(entrada);
    entrada = IO.readln("Entre com a avaliação de desempenho: ");
    avaliacao = Double.parseDouble(entrada);
    if (vendas >= 10000.00) {
        Salario += (vendas * 0.07);
    }
    else {
        Salario += (vendas * 0.05);
    }
    if (avaliacao >= 8){
        Salario += 500.00;

    }
    IO.println(String.format("", Salario));
}