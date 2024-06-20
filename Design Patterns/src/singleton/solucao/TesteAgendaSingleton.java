package singleton.solucao;

import singleton.problema.Agenda;

public class TesteAgendaSingleton {

    public static void main(String[] args) {
        AgendaSingletonENUM agenda1 = AgendaSingletonENUM.getInstance();
        AgendaSingletonENUM agenda2 = AgendaSingletonENUM.getInstance();
        System.out.println(agenda1);
        System.out.println(agenda1);
        reservaDiaENUM("Sexta");
        reservaDiaENUM("Sábado");
    }

    public static void reservaDiaEAGER(String dia) {
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static void reservaDiaLAZY(String dia) {
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static void reservaDiaENUM(String dia) {
        AgendaSingletonENUM agenda = AgendaSingletonENUM.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
