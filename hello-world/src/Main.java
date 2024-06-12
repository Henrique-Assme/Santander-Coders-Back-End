import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        String nome = "Henrique";
        String teste;
        teste = "oi";
        teste = "outro oi";
        System.out.println("hello, " + nome + teste);

        int a, b, c;
        float divisao;
        b = 2;
        a = 3;
        c = a + b;
        divisao = (float) a /b;
        System.out.println(c);
        System.out.println(divisao);
        boll();
        condicional();
        textos();
        arrays();
    }

    public static void boll() {
        boolean resultado = false;
        resultado = resultado && true;
        System.out.println(resultado);
        resultado = resultado || true;
        System.out.println(resultado);
        resultado = resultado ? false : true;
        System.out.println(resultado);
    }

    public static void condicional() {
        int nota = 50;
        if(nota >= 70) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        String curso = "java";

        switch (curso) {
            case "java":
                System.out.println("Curso errado");
                break;
            case "programação":
                System.out.println("Curso certo");
                break;
            case "python":
                System.out.println("Curso errado");
                break;
            default:
                System.out.println("Curso errado");
                break;
        }
    }

    public static void textos() {
        String nome = "Henrique";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.length());
        System.out.println(nome.equals("Henique"));
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
    }

    public static int[] loops(int[] array) {
        for(int i = 0; i < 10; i++) {
            array[i] = i;
        }
        return array;
    }

    public static void arrays() {
        int[] numeros = new int[10];
        System.out.println(loops(numeros)[7]);
    }
}
