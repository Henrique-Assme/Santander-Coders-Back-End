package builder.solucao;

public class TesteAnimal {

    public static void main(String[] args) {
        Animal cachorro = Animal.builder()
                .nome("Tutu")
                .raca("Viralata")
                .dono("Bruna")
                .build();

        System.out.println(cachorro);
    }
}
