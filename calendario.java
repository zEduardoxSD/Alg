void main (){
    String entrada;
    entrada = IO.readln("Entre com a data: ");
    String [] partes = entrada.split("/");
    switch (partes[0]){
        case "01", "21", "31" -> partes[0] = partes[0] + "st, ";
        case "2", "22" -> partes[0] = partes[0] + "nd, ";
        case "3", "23" -> partes[0] = partes[0] + "rd, ";
        case "4", "5", "6", "7", "8", "9", "10", "11", "12","13","14","15","16","17","18","19","20","24","25","26","27","28","29","30" -> partes[0] = partes[0] + "th, ";
        default -> IO.print("Data invalida");
    }
    switch (partes[1]) {
        case "01" -> partes[1] =  "January";
        case "02" -> partes[1] =  "Febuary";
        case "03" -> partes[1] =  "March";
        case "04" -> partes[1] =  "April";
        case "05" -> partes[1] =  "May";
        case "06" -> partes[1] =  "June";
        case "07" -> partes[1] =  "July";
        case "08" -> partes[1] =  "August";
        case "09" -> partes[1] =  "September";
        case "10" -> partes[1] =  "October";
        case "11" -> partes[1] =  "November";
        case "12" -> partes[1] =  "December";
        default -> IO.print("Mês invalido");
    }
    IO.print(partes[1] + " ");
    IO.print(partes[0] + " ");
    IO.println(partes[2]);
}