void main() {
        String entrada;
        Double alturaMetros;
        entrada = IO.readln("Entre com pes: ");
        double pes = Double.parseDouble(entrada);
        entrada = IO.readln("Entre com os polegadas: ");
        double polegada = Double.parseDouble(entrada);
        alturaMetros = ((pes * 12 * 2.54) + (polegada * 2.54));
        IO.println(String.format("%.2f",alturaMetros / 100));
}