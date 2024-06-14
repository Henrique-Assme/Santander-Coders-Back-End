package Animais;

public class Cachorro extends Animal{

    static int numeroDeCachorros;

    private int tamanhoDoRabo;
    private String estadoDeEspirito;

    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
        super(nome, cor, altura, peso);
        this.tamanhoDoRabo = tamanhoDoRabo;

        numeroDeCachorros++;
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorro) {
        Cachorro.numeroDeCachorros = numeroDeCachorro;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {
        switch (acao) {
            case "carinho":
                estadoDeEspirito = "Feliz";
                break;
            case "comida":
                estadoDeEspirito = "Satisfeito";
                break;
            default:
                estadoDeEspirito = "Neutro";
                break;
        }
        return estadoDeEspirito;
    }

    @Override
    public void soar() {
        System.out.println("Au Au");
    }
}
