import java.util.ArrayList;
import java.util.List;

/**
 * @author Evandro Santos
 */

public class Pessoa {
    private String nome;
    private String sexo;

    private static List<Pessoa> listaMasculina = new ArrayList<>();
    private static List<Pessoa> listaFeminina = new ArrayList<>();

    public Pessoa(String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;

        if (this.sexo.equalsIgnoreCase("Masculino")|| this.sexo.equalsIgnoreCase("M")){
            listaMasculina.add(this);
        } else if (this.sexo.equalsIgnoreCase("Feminino") ||this.sexo.equalsIgnoreCase("F")) {
            listaFeminina.add(this);
        } else {
            System.out.println("Cadastro não finalizado");
        }
    }
    public static void exibirListaMasculina() {
        System.out.println("Lista Masculina:");
        for (Pessoa p : listaMasculina) {
            System.out.println(p.nome);
        }
    }

    public static void exibirListaFeminina() {
        System.out.println("Lista Feminina:");
        for (Pessoa p : listaFeminina) {
            System.out.println(p.nome);
        }
    }

    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', sexo='" + sexo + "'}";
    }
}
