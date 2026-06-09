void main(){
    String buffer = IO.readln("Entre com o número de N: ");
    int n = Integer.parseInt(buffer);
    int base = n;
    IO.println(potenciaFatorial(4, 4));
}

int potenciaFatorial(int base, int expoente){
    int potencia = 0;
    int T = base;
    expoente = base;
    for (int i = 1; i <= T -1; i++) {
        base -= 1;
        expoente = expoente * base;
    }potencia = expoente;
    return potencia;
}