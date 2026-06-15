final String[] PARTIDA = {"08:00","09:43","11:19","12:47", "14:00", "15:45","19:00","21:45" };
final String[] CHEGADA = {"10:16","11:52","13:31","15:00","16:08","17:55","21:20","23:58"};
void main() {
    String buffer = IO.readln("Entre com o horário atual (HH:MM): ");
    for(int i=0; i<8; i++){
        if (horarioParaMinutos(buffer) <= horarioParaMinutos(PARTIDA[i]) ) {
        IO.println("Próxima partida: " + PARTIDA[i]);
        IO.println("Horário de chegada: " + CHEGADA[i]);
        break;
    } else if(i >= 7)  {
    IO.println("Não há mais voos disponíveis hoje");
    }
   
}
   /* if (horarioParaMinutos(buffer) <= horarioParaMinutos(PARTIDA[0]) ) {
        IO.println("Próxima partida: " + PARTIDA[0]);
        IO.println("Horário de chegada: " + CHEGADA[0]);
    }
    else if (horarioParaMinutos(buffer) <= horarioParaMinutos(PARTIDA[1]) ) {
        IO.println("Próxima partida: " + PARTIDA[1]);
        IO.println("Horário de chegada: " + CHEGADA[1]);
    }
        else if (horarioParaMinutos(buffer) <= horarioParaMinutos(PARTIDA[2]) ) {
        IO.println("Próxima partida: " + PARTIDA[2]);
        IO.println("Horário de chegada: " + CHEGADA[2]);
    }
        else if (horarioParaMinutos(buffer) <= horarioParaMinutos(PARTIDA[3]) ) {
        IO.println("Próxima partida: " + PARTIDA[3]);
        IO.println("Horário de chegada: " + CHEGADA[3]);
    }
        else if (horarioParaMinutos(buffer) <= horarioParaMinutos(PARTIDA[4]) ) {
        IO.println("Próxima partida: " + PARTIDA[4]);
        IO.println("Horário de chegada: " + CHEGADA[4]);
    }
        else if (horarioParaMinutos(buffer) <= horarioParaMinutos(PARTIDA[5]) ) {
        IO.println("Próxima partida: " + PARTIDA[5]);
        IO.println("Horário de chegada: " + CHEGADA[5]);
    }
        else if (horarioParaMinutos(buffer) <= horarioParaMinutos(PARTIDA[6]) ) {
        IO.println("Próxima partida: " + PARTIDA[6]);
        IO.println("Horário de chegada: " + CHEGADA[6]);
    }
        else if (horarioParaMinutos(buffer) <= horarioParaMinutos(PARTIDA[7]) ) {
        IO.println("Próxima partida: " + PARTIDA[7]);
        IO.println("Horário de chegada: " + CHEGADA[7]);
    }else IO.println("Não há mais voos disponíveis hoje");*/
}
int horarioParaMinutos(String horario) {
    String[] partes = horario.split(":");
    int hh = Integer.parseInt(partes[0]);
    int mm = Integer.parseInt(partes[1]);
    int minutos = hh * 60 + mm;
    return minutos;
}
