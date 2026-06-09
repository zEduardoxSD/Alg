void main(){
    String buffer;
    String buffer2;
    String buffer3 = IO.readln("Entre com o número de medições: ");
    double phminimo = Double.parseDouble(buffer);
    double phmaximo = Double.parseDouble(buffer2);
    int medicoes = Integer.parseInt(buffer3);
    
    for (phminimo = 0, phmaximo = 0; medicoes > 0; medicoes -= medicoes){
            buffer = IO.readln("Entre com o PH mínimo: ");
            buffer2 = IO.readln("Entre com o PH máximo: ");
            phminimo = Double.parseDouble(buffer);
            phmaximo = Double.parseDouble(buffer2);
        
    }   
}