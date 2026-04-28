void main() {
        Scanner sc = new Scanner(System.in);
        IO.print("Entre com P1 e R1: ");
        double p1 = sc.nextDouble();
        double r1 = sc.nextDouble();
        IO.print("Entre com P2 e R2: ");
        double p2 = sc.nextDouble();
        double r2 = sc.nextDouble();
        IO.print("Entre com P3 e R3: ");
        double p3 = sc.nextDouble();
        double r3 = sc.nextDouble();
        IO.print("Entre com a frequencia (Em %) :");
        double Freq = sc.nextDouble();
        double n1 = Math.max(p1, r1);
        double n2 = Math.max(p2, r2);
        double n3 = Math.max(p3, r3);
        double media = ((n1 + n2 + n3) / 3.0);
        IO.println("Média: " + String.format("%.1f", media));
        long mediaArredondada = Math.round(media);
        IO.println(mediaArredondada);
        boolean aprovado = mediaArredondada >= 6 && Freq <= 60;
        IO.println("Aprovado: " + aprovado);
        sc.close();

    }
