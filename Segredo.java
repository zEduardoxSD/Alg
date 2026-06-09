void main (){
    int palpite;
    int tentativas = 0;
    Random rnd = new Random();
    int segredo = rnd.nextInt(1, 101);
    do {
        String buffer = IO.readln("Entre com seu palpite (1 a 100): ");
        palpite = Integer.parseInt(buffer);
        tentativas += 1;
        if (segredo >  palpite){
            IO.println("o segredo é maior");
        }
        else if (segredo < palpite){
            IO.println("o segredo é menor");
        }
    }while(palpite != segredo);
    IO.println("Parabéns você acertou em: " + tentativas + " tentativas");
}

