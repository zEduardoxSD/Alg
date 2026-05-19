void main (){
    String partes[];
    String buffer = IO.readln("Entre primeiro com as cordenadas do primeiro local : ");
    partes = buffer.split(" ");
    double La1 = Math.toRadians(Double.parseDouble(partes[0]));
    double lo1 = Math.toRadians(Double.parseDouble(partes[1]));
    buffer = IO.readln("Entre vom as coordenadas do segundo local: ");
    partes = buffer.split(" ");
    double La2 = Math.toRadians(Double.parseDouble(partes[0]));
    double lo2 = Math.toRadians(Double.parseDouble(partes[1]));
    double DistanciaFinal = distanciaTerra(La1, lo1, La2, lo2);
    IO.println("A distancia entre dois pontos é: "  + String.format("%.2f", DistanciaFinal) + "km");
}

double distanciaTerra(double La1, double lo1, double La2, double lo2){
    double distancia = 2*6371*Math.asin(Math.sqrt(hav(La2-La1)+ Math.cos(La1)*Math.cos(La2)*hav(lo2-lo1)));
    return distancia;
}


double hav(double theta){
    double hava = Math.pow(Math.sin(theta/2), 2);
    return hava;
}