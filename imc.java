void main() {
        String entrada;
        double peso, altura;
        entrada = IO.readln("Entre com o peso: ");
        peso = Double.parseDouble(entrada);
        entrada = IO.readln("Entre com a altura: ");
        altura = Double.parseDouble(entrada);
        double imc = peso / (altura * altura);
        if (imc <= 18.5) {
            IO.println("Abaixo do peso ideal ");
        } else if (imc < 25) {
            IO.println("Peso normal ");
        } else if (imc < 30) {
            IO.println("Sobrepeso ");
        } else {
            IO.println("Obesidade ");
        }
        IO.println("IMC: " + String.format("%.2f", imc));

    }
