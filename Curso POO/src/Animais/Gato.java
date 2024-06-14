package Animais;

public class Gato extends Animal{
    static int numeroDeGatos;

    public Gato(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso);
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeGatos++;
    }

    @Override
    public void soar() {
        System.out.println("Miau Miau");
    }

}
