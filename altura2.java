void main() {
    String entrada;
        Double americano;
        entrada = IO.readln("Entre com metros: ");
        double metros = Double.parseDouble(entrada);
        entrada = IO.readln("Entre com os centimetros: ");
        double centimetros = Double.parseDouble(entrada);
        americano = (metros * 3.28) + (centimetros * 0.39);
        IO.println(americano);
}