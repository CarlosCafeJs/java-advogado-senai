import java.util.*;

import entities.*;;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        List<Advogados> advogados = new ArrayList<Advogados>();
        Boolean continuar = true;

        while (continuar) {
            String s = "";
            System.out.println("Deseja Sair? S/N");
            s = sc.nextLine();
            if (s.equals("s")) {
                continuar = false;
            }

            System.out.println("Deseja cadastrar cliente ou advogado?");
            String escolhaClAd = sc.nextLine();

            if (escolhaClAd.equals("1")) {
             
                System.out.println("Digite o NOME do advogado : ");
                String nome = sc.nextLine();
                System.out.println("Digite CPF do advogado : ");
                String cpf = sc.nextLine();
                System.out.println("Digite o EMAIL do advogado : ");
                String email = sc.nextLine();
                System.out.println("Digite o registro OAB do advogado : ");
                Integer oabRegistro = sc.nextInt();
                System.out.println("Digite o registro o NUMERO para contato do advogado : ");
                String numeroContato = sc.nextLine();

            } else if (escolhaClAd.equals("2")) {
                System.out.println("Tudo certo por aqui");
                continue;
                // sc.nextLine();
                // System.out.println("");
                // String nome = sc.nextLine();
                // System.out.println("");
                // String nome = sc.nextLine();
                // System.out.println("");
                // String nome = sc.nextLine();
                // System.out.println("");
                // String nome = sc.nextLine();
                // System.out.println("");
                // String nome = sc.nextLine();
            } else {
                System.out.println("Opção Invalida!!");
            }

        }
    }
}
