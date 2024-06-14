import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Tubarão", "Marrom", 25, 5.5, 5);
        System.out.println(cachorro1.getNumeroDeCachorros());
//        sem construtor
//        cachorro1.setNome("Tubarão");
//        cachorro1.setCor("Marrom");
//        cachorro1.setAltura(25);
//        cachorro1.setPeso(5.5);
//        cachorro1.setTamanhoDoRabo(5);
        Cachorro cachorro2 = new Cachorro("Bonie", "Caramelo", 15, 2.5, 1);

        System.out.println(cachorro1.getNumeroDeCachorros());

        cachorro1.soar();
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());
        System.out.println(cachorro1.interagir("carinho"));
        System.out.println(cachorro1.interagir("comida"));

        Passaro passaro1 = new Passaro("Zeca", "Verde", 5, 1, "Zem");
        Gato gato1 = new Gato("Jorge", "Cinza", 3, 4, "Neutroo");

        gato1.soar();
        passaro1.soar();

        Petshop petshop = new Petshop();
        petshop.darBanho(cachorro2);
        petshop.darBanho(gato1);
        petshop.tosar(cachorro1);
        System.out.println(cachorro2.getEstadoDeEspirito());
        System.out.println(gato1.getEstadoDeEspirito());
        System.out.println(cachorro1.getEstadoDeEspirito());
    }
}