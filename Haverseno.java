void main (){
    String buffer = IO.readln("Entre primeiro com as cordenadas do primeiro local depois do segundo");
    double La1 = Math.toRadians(Double.parseDouble(buffer));
    double lo1 = Math.toRadians(Double.parseDouble(buffer));
    double La2 = Math.toRadians(Double.parseDouble(buffer));
    double lo2 = Math.toRadians(Double.parseDouble(buffer));
    double DistanciaFinal = distanciaTerra;
    IO.println("A distancia entre dois pontos é: " (distanciaTerra));
}

double distanciaTerra(double La1, double lo1, double La2, double lo2){
    double distancia = 2*6371*Math.asin(Math.sqrt(hav(La2-La1)+ Math.cos(La1)*Math.cos(La2)*hav(lo2-lo1)));
    return distancia;
}


double hav(double theta){
    double hava = Math.pow(Math.sin(theta/2), 2);
    return hava;
}