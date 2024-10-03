package br.com.advocacia;

import java.util.*;

import br.com.advocacia.entities.*;
import br.com.advocacia.validations.ClearConsole;
import br.com.advocacia.validations.EmailValidation;
import br.com.advocacia.validations.NumContatoValidation;;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        List<Advogados> advogados = new ArrayList<Advogados>();
        List<Clientes> clientes = new ArrayList<Clientes>();

        while (true) {
            String continuarPerg = "";
            String numeroContato = "";
            String email = "";
            String docId = "";
            // String numeroContato

            while (true) {

                System.out.println("Deseja Cadastrar um Cliente? ");
                System.out.println("S - Sim ");
                System.out.println("N - Não? ");

                continuarPerg = sc.nextLine();
                if (continuarPerg.toUpperCase().equals("S")) {
                    break;

                } else if (continuarPerg.toUpperCase().equals("N")) {
                    continue;
                } else {
                    System.out.println("Opção Invalida!");
                    ClearConsole.limpar();
                }
            }
            ClearConsole.limpar();
            System.out.println("Digite o numero de sua escolha :");
            System.out.println("1. Cadastrar Advogado :");
            System.out.println("2. Cadastrar Cliente :");
            String escolhaClAd = sc.nextLine();

            if (escolhaClAd.equals("1")) {

                ClearConsole.limpar();
                System.out.println("Digite o NOME do advogado : ");
                String nome = sc.nextLine();
                ClearConsole.limpar();
                while (true) {
                    int opcaocpfcnpj = 0;
                    System.out.println("Escolha o tipo de documento:");
                    System.out.println("1. CPF");
                    System.out.println("2. CNPJ");
                    opcaocpfcnpj = sc.nextInt();
                    sc.nextLine();
                    ClearConsole.limpar();
                    if (opcaocpfcnpj == 1) {
                        System.out.println("Digite CPF do advogado : ");
                        docId = sc.nextLine();
                        break;
                    } else if (opcaocpfcnpj == 2) {
                        System.out.println("Digite CNPJ do advogado : ");
                        docId = sc.nextLine();
                        break;
                    } else {
                        System.out.println("Digite uma opção valida!");
                    }
                }

                while (true) {
                    ClearConsole.limpar();
                    System.out.println("Digite o NUMERO DE CONTATO do advogado : ");
                    numeroContato = sc.nextLine();
                    if (NumContatoValidation.validar(numeroContato)) {
                        break;
                    } else {
                        System.out.println("Email invalido! \nPorfavor digite um email valido!");
                    }

                }
                ClearConsole.limpar();
                System.out.println("Digite o registro OAB do advogado : ");
                Integer oabRegistro = sc.nextInt();

                advogados.add(new Advogados(nome, docId, email, oabRegistro, numeroContato, null));

                ClearConsole.limpar();

                System.out.println("Advogado cadastrado com sucesso!");
                break;

            } else if (escolhaClAd.equals("2")) {

                System.out.println("Digite o NOME do advogado : ");
                String nome = sc.nextLine();

                while (true) {
                    int opcaocpfcnpj = 0;
                    System.out.println("Escolha o tipo de documento:");
                    System.out.println("1. CPF");
                    System.out.println("2. CNPJ");
                    opcaocpfcnpj = sc.nextInt();
                    sc.nextLine();
                    if (opcaocpfcnpj == 1) {
                        System.out.println("Digite CPF do advogado : ");
                        docId = sc.nextLine();

                        break;
                    } else if (opcaocpfcnpj == 2) {
                        System.out.println("Digite CNPJ do advogado : ");
                        docId = sc.nextLine();
                        break;
                    } else {
                        System.out.println("Digite uma opção valida!");
                    }
                }

                while (true) {
                    System.out.println("Digite o NUMERO DE CONTATO do advogado : ");
                    email = sc.nextLine();
                    if (EmailValidation.validar(email)) {
                        break;
                    } else {
                        System.out.println("Email invalido! \nPorfavor digite um email valido!");
                    }

                }

                System.out.println("Digite o registro OAB do advogado : ");
                Integer oabRegistro = sc.nextInt();

                advogados.add(new Advogados(nome, docId, email, oabRegistro, numeroContato, null));
            } else {
                System.out.println("Erro ao cadastrar, por favor tente novamente!");
            }

            for (Clientes cli : clientes) {
                System.out.println(cli);
            }
            sc.close();
        }
    }
}
