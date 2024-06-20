package builder.solucao;

import builder.Pessoa;

public class TestePessoaComBuilder {

    public static void main(String[] args) {
        Pessoa pessoa = new PessoaBuilder()
                .nome("Henrique")
                .sobreNome("Assme")
                .apelido("Heni")
                .email("email@teste")
                .dataNascimento("14/04/2003")
                .documento("123456789")
                .build();
        System.out.println(pessoa);
    }
}
