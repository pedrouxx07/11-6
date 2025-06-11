package boanoitee;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class funcionarios {

    public static void empresa4(Scanner teclado) {
        try {
            System.out.println("----Clientes----");
            ArrayList<String> funcionarios = new ArrayList<>();

            System.out.print("Quantos funcionarios você deseja cadastrar?: ");
            int quantidade = teclado.nextInt();
            teclado.nextLine(); 

            for (int i = 0; i < quantidade; i++) {
                System.out.println("\nCliente " + (i + 1));
                System.out.print("Nome: ");
                String nome = teclado.nextLine();
                System.out.print("Email: ");
                String email = teclado.nextLine();
                System.out.print("Endereço: ");
                String endereco = teclado.nextLine();
                System.out.print("Cargo: ");
                String cargo = teclado.nextLine();
                System.out.print("Salário: ");
                String salario = teclado.nextLine();
                System.out.print("Folga: ");
                String folga = teclado.nextLine();

                String dadoFuncionario = "Nome: " + nome + " | Email: " + email + " | Endereço: " + endereco +
                        " | Cargo: " + cargo + " | Salario: " + salario + " | Folga: " + folga;
                funcionarios.add(dadoFuncionario);
            }

            System.out.println("\nClientes cadastrados:");
            for (String f : funcionarios) {
                System.out.println(f);
            }

            System.out.println("\n----Funcionários-----");
            System.out.println("Qual Funcionário você quer acessar?");
            System.out.println("Selecione de (1 a 10)");
            System.out.print("Ou selecione (11) para ver todos os funcionários: ");
            System.out.print("\n Caso não queira acessar digite (12): ");

            int escolha = teclado.nextInt();

            if (escolha == 1) {
                System.out.print("Nome: João Silva | Email: joao@email.com | Endereço: Rua A, 123 | Cargo: Gerente | Salário: R$ 7.000,00 | Folga: Domingo ");
            } else if (escolha == 2) {
                System.out.print("Nome: Maria Oliveira | Email: maria@email.com | Endereço: Av. B, 456 | Cargo: Analista | Salário: R$ 5.200,00 | Folga: Sábado ");
            } else if (escolha == 3) {
                System.out.print("Nome: Carlos Souza | Email: carlos@email.com | Endereço: Rua C, 789 | Cargo: Técnico | Salário: R$ 3.800,00 | Folga: Domingo ");
            } else if (escolha == 4) {
                System.out.print("Nome: Ana Lima | Email: ana@email.com | Endereço: Rua D, 321 | Cargo: Coordenadora | Salário: R$ 6.500,00 | Folga: Sexta ");
            } else if (escolha == 5) {
                System.out.print("Nome: Pedro Rocha | Email: pedro@email.com | Endereço: Av. E, 654 | Cargo: Vendedor | Salário: R$ 3.000,00 | Folga: Segunda ");
            } else if (escolha == 6) {
                System.out.print("Nome: Fernanda Dias | Email: fernanda@email.com | Endereço: Rua F, 987 | Cargo: RH | Salário: R$ 4.200,00 | Folga: Quarta ");
            } else if (escolha == 7) {
                System.out.print("Nome: Lucas Almeida | Email: lucas@email.com | Endereço: Av. G, 111 | Cargo: Estagiário | Salário: R$ 1.200,00 | Folga: Sábado ");
            } else if (escolha == 8) {
                System.out.print("Nome: Patrícia Martins | Email: patricia@email.com | Endereço: Rua H, 222 | Cargo: Designer | Salário: R$ 4.800,00 | Folga: Segunda ");
            } else if (escolha == 9) {
                System.out.print("Nome: Ricardo Costa | Email: ricardo@email.com | Endereço: Av. I, 333 | Cargo: Motorista | Salário: R$ 3.500,00 | Folga: Terça ");
            } else if (escolha == 10) {
                System.out.print("Nome: Juliana Pires | Email: juliana@email.com | Endereço: Rua J, 444 | Cargo: Supervisora | Salário: R$ 5.900,00 | Folga: Quinta ");
            } else if (escolha == 11) {
                System.out.print("\n Nome: João Silva | Email: joao@email.com | Endereço: Rua A, 123 | Cargo: Gerente | Salário: R$ 7.000,00 | Folga: Domingo ");
                System.out.print("\n Nome: Maria Oliveira | Email: maria@email.com | Endereço: Av. B, 456 | Cargo: Analista | Salário: R$ 5.200,00 | Folga: Sábado ");
                System.out.print("\n Nome: Carlos Souza | Email: carlos@email.com | Endereço: Rua C, 789 | Cargo: Técnico | Salário: R$ 3.800,00 | Folga: Domingo ");
                System.out.print("\n Nome: Ana Lima | Email: ana@email.com | Endereço: Rua D, 321 | Cargo: Coordenadora | Salário: R$ 6.500,00 | Folga: Sexta ");
                System.out.print("\n Nome: Pedro Rocha | Email: pedro@email.com | Endereço: Av. E, 654 | Cargo: Vendedor | Salário: R$ 3.000,00 | Folga: Segunda ");
                System.out.print("\n Nome: Fernanda Dias | Email: fernanda@email.com | Endereço: Rua F, 987 | Cargo: RH | Salário: R$ 4.200,00 | Folga: Quarta ");
                System.out.print("\n Nome: Lucas Almeida | Email: lucas@email.com | Endereço: Av. G, 111 | Cargo: Estagiário | Salário: R$ 1.200,00 | Folga: Sábado ");
                System.out.print("\n Nome: Patrícia Martins | Email: patricia@email.com | Endereço: Rua H, 222 | Cargo: Designer | Salário: R$ 4.800,00 | Folga: Segunda ");
                System.out.print("\n Nome: Ricardo Costa | Email: ricardo@email.com | Endereço: Av. I, 333 | Cargo: Motorista | Salário: R$ 3.500,00 | Folga: Terça ");
                System.out.print("\n Nome: Juliana Pires | Email: juliana@email.com | Endereço: Rua J, 444 | Cargo: Supervisora | Salário: R$ 5.900,00 | Folga: Quinta ");
            } else if (escolha == 12) {
                System.out.println("------------------------------------------------");
            } else {
                System.out.println("Número inválido. Digite de 1 a 11.");
            }

            System.out.println("\nDigite 0 para voltar ao menu:");
            int voltar = teclado.nextInt();
            if (voltar == 0) {
                main.voltaraoMenu(); 
            } else {
                System.out.println("Encerrando o programa.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro encontrado. Use numero inteiro. ");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            teclado.close(); 
        }
    }
}
