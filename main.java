public class main {
        public static void main(String[] args){
            Felinos animal0 = new Felinos(92.0,"Mamifero carniboro","Amarillo",63.2);
            Felinos animal1 = new Leon("Leon","Caza",3.0,"Mamifero","Dorado",1.60);
            Felinos animal2 = new Tigre("Tigre","Nadador",1.10,"Mamifero carniboro","Anaranjado",3.10);
            Felinos animal3 = new Jaguar("Jaguar","Nadador",1.8,"Mamifero carniboro","Amarillo rojizo",96.0);
            Felinos animal4 = new Serval("Serval","Agil",100.0,"Mamifero Carniboro","Amarillento con negro",12.0);
            Felinos animal5 = new Leopardo("Leopardo","Rapidos",70.0,"Mamifero carniboro","Amarillo con motas obscuras",31.0);

            System.out.println("5 FELINOS");
            System.out.println("1RO --->"+((Leon) animal1).getNombre());
            System.out.println("--------------------------------------------");
            System.out.println("HABILIDAD--->"+((Leon) animal1).getHabilidad());
            System.out.println("MEDIDA--->"+((Leon) animal1).getMide());
            System.out.println("TIPO--->"+((Leon) animal1).getTipo_E());
            System.out.println("COLOR--->"+((Leon) animal1).getColor());
            System.out.println("PESO--->"+((Leon) animal1).getPeso());
            System.out.println("--------------------------------------------");
            System.out.println("2RO --->"+((Tigre)animal2).getNombre());
            System.out.println("--------------------------------------------");
            System.out.println("HABILIDAD--->"+((Tigre) animal2).getHabilidad());
            System.out.println("MEDIDA--->"+((Tigre) animal2).getMide());
            System.out.println("TIPO--->"+((Tigre) animal2).getTipo_E());
            System.out.println("COLOR--->"+((Tigre) animal2).getColor());
            System.out.println("PESO--->"+((Tigre) animal2).getPeso());
            System.out.println("--------------------------------------------");
            System.out.println("3RO --->"+((Jaguar)animal3).getNombre());
            System.out.println("--------------------------------------------");
            System.out.println("HABILIDAD--->"+((Jaguar) animal3).getHabilidad());
            System.out.println("MEDIDA--->"+((Jaguar) animal3).getMide());
            System.out.println("TIPO--->"+((Jaguar) animal3).getTipo_E());
            System.out.println("COLOR--->"+((Jaguar) animal3).getColor());
            System.out.println("PESO--->"+((Jaguar) animal3).getPeso());
            System.out.println("--------------------------------------------");
            System.out.println("4TO --->"+((Serval)animal4).getNombre());
            System.out.println("--------------------------------------------");
            System.out.println("HABILIDAD--->"+((Serval) animal4).getHabilidad());
            System.out.println("MEDIDA--->"+((Serval) animal4).getMide());
            System.out.println("TIPO--->"+((Serval) animal4).getTipo_E());
            System.out.println("COLOR--->"+((Serval) animal4).getColor());
            System.out.println("PESO--->"+((Serval) animal4).getPeso());
            System.out.println("--------------------------------------------");
            System.out.println("5TO --->"+((Leopardo)animal5).getNombre());
            System.out.println("--------------------------------------------");
            System.out.println("HABILIDAD--->"+((Leopardo) animal5).getHabilidad());
            System.out.println("MEDIDA--->"+((Leopardo) animal5).getMide());
            System.out.println("TIPO--->"+((Leopardo) animal5).getTipo_E());
            System.out.println("COLOR--->"+((Leopardo) animal5).getColor());
            System.out.println("PESO--->"+((Leopardo) animal5).getPeso());
            System.out.println("--------------------------------------------");


        }

    }
