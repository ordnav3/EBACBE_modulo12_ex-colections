import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Tarefa 1

        System.out.println("Deseja cadastrar alguém ?");
        String resposta = scanner.nextLine();

        while (resposta.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("S")) {
            System.out.println("Digite os nomes separados por virgula");
            String nome = scanner.nextLine();

            List<String> nomes = new ArrayList<>(Arrays.asList(nome.split(",")));
            Collections.sort(nomes);

            System.out.println("***** Lista de nomes ******");
            for (String n : nomes) {
                System.out.println(n);
            }
            System.out.println("**************************");

            System.out.println("Deseja cadastrar mais alguém ?");
            resposta = scanner.nextLine();
        }

        //Tarefa 2

        System.out.println("Deseja cadastrar alguém na lista feminina ou masculina ?");
        String resposta2 = scanner.nextLine();

        while (resposta2.equalsIgnoreCase("Sim") || resposta2.equalsIgnoreCase("S")){
            System.out.println("Digite o nome e o sexo da pessoa separado por um - ");
            String individuo = scanner.nextLine();
            String[] partes = individuo.split("-");

            String nome = partes[0];
            String sexo = partes[1];

            Pessoa pessoa = new Pessoa(nome, sexo);

            System.out.println("Deseja cadastrar mais alguém ?");
            resposta2 = scanner.nextLine();
        }
        System.out.println("******************************");
        Pessoa.exibirListaMasculina();
        Pessoa.exibirListaFeminina();
        System.out.println("******************************");


        System.out.println("Muito Obrigado !");
    }
}