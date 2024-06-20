package builder.solucao;

import lombok.*;

@Data // fornece os getters e setters todos
@AllArgsConstructor // faz um construtor com todos os argumentos
@NoArgsConstructor // faz um construtor vazio
@Builder // cria um builder
public class Animal {

    private String nome;
    private String dono;
    private String raca;
}
