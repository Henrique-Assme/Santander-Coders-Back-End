package builder.problema;

import builder.Pessoa;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(
                "Henrique",
                "Assme",
                "1234565789",
                "email@email.com.br",
                "Heni",
                "14/04/2003");

        System.out.println(pessoa);
    }
}
