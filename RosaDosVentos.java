void main(){
    String buffer = IO.readln("Ente com o ângulo (graus): ");
    int graus = Integer.parseInt(buffer);
    int voltas = graus / 360;
    IO.println(voltas);
    String direcao = "a";
    IO.println(direcao);
    switch (graus < 45) {
        case true -> direcao = "Norte";    
        default -> direcao = ""; 
    }
        switch (graus < 90) {
        case true -> direcao = "Nordeste";    
        default -> direcao = ""; 
    }
        switch (graus < 135) {
        case true -> direcao = "Leste";    
        default -> direcao = ""; 
    }
        switch (graus < 180 ) {
        case true -> direcao = "Sudeste";    
        default -> direcao = ""; 
    }
        switch (graus < 225 ) {
        case true -> direcao = "Sul";    
        default -> direcao = ""; 
    }
        switch (graus < 270) {
        case true -> direcao = "Sudoeste";    
        default -> direcao = ""; 
    }
    switch (graus < 315) {
        case true -> direcao = "Oeste";    
        default -> direcao = ""; 
    }
        switch (graus < 360) {
        case true -> direcao = "Leste";    
        default -> direcao = ""; 
    }
    if (voltas >= 1 && voltas <= 1 ){
        IO.println(direcao + ", após" + voltas + "volta completa" );
    }
    if (voltas < 1){
        IO.println(direcao);
    }
    if (voltas > 1){
        IO.println(direcao + ", após" + voltas + "voltas completas" );
    }
}