void main(){
    String buffer = IO.readln("Entre com o diâmetro(cm): ");
    Double diametro = Double.parseDouble(buffer);
    buffer = IO.readln("Entre com a altura(cm): ");
    Double altura = Double.parseDouble(buffer);
    buffer = IO.readln("Entre com a espessura da chapa(cm): ");
    Double espessura = Double.parseDouble(buffer);
    buffer = IO.readln("Entre com a densidade (g/cm³): ");
    Double densidade = Double.parseDouble(buffer);
    buffer = IO.readln("Entre com o número de latas: ");
    Double latas = Double.parseDouble(buffer);
    Double raio = diametro / 2;
    Double massatotal = calculaMassaLata(diametro, altura, espessura, densidade) * latas;
    IO.println("Massa total: " + massatotal);
}
Double calculaAreaCirculo(double raio){
    Double areac = Math.PI * (raio * raio);
    return areac;
}
Double calculaAreaSuperficie (double raio, double altura){
    Double areal = 2 * Math.PI * raio * altura;
    Double areas = areal + calculaAreaCirculo(raio) + calculaAreaCirculo(raio);
    return areas;
}
Double calculaMassaLata (Double diametro, double altura, double espessura, double densidade){
    Double raio = diametro / 2;
    Double volume = calculaAreaSuperficie(raio, altura) * espessura;
    Double massa = volume * densidade;
    return massa;
}