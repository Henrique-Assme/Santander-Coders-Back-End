package prototype.solucao;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class TesteBotaoPrototype {

    public static void main(String[] args) {
        Botao botaoVermelho = BotaoRegistry.getBotao("BOTAO VERMELHO");
        System.out.println(botaoVermelho);

        Botao botaoAmarelo = BotaoRegistry.getBotao("BOTAO AMARELO");
        botaoAmarelo.setAltura(200);
        System.out.println(botaoAmarelo);

        Botao botaoAmarelo2 = BotaoRegistry.getBotao("BOTAO AMARELO");
        System.out.println(botaoAmarelo2);

        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO AZUL");
        System.out.println(botaoAzul);

        String chave = "BOTAO PRETO";
        Botao botaoPreto = new Botao();
        botaoPreto.setCor("Preto");
        botaoPreto.setLargura(100);
        botaoPreto.setAltura(40);
        botaoPreto.setTipoBorda(TipoBordaEnum.GROSSA);
        BotaoRegistry.addRegistry(chave,botaoPreto);
    }
}
