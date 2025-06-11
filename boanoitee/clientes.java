package boanoitee;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class clientes {

	public static void empresa1(Scanner teclado) {
		try {
		System.out.println("----Clientes----");

        ArrayList<String> clientes1 = new ArrayList<>();

        System.out.print("Quantos clientes você deseja cadastrar?: ");
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

            System.out.print("Telefone: ");
            String telefone = teclado.nextLine();

            System.out.print("CPF: ");
            String cpf = teclado.nextLine();

            System.out.print("CNPJ: ");
            String cnpj = teclado.nextLine();

            System.out.print("Razão Social: ");
            String rz = teclado.nextLine();

            String dadoCliente = "Nome: " + nome + " | Email: " + email + " | Endereço: " + endereco +
                    " | Telefone: " + telefone + " | CPF: " + cpf + " | CNPJ: " + cnpj + " | Razão Social: " + rz;

            clientes1.add(dadoCliente);
        }

        System.out.println("\nClientes cadastrados:");
        for (String c : clientes1) {
            System.out.println(c);
        }
        
        
        System.out.print("\n Veja os outros clientes cadastrados: ");
        System.out.print("\n------------------------------------------------------------------------------------------------");
        System.out.print("\n Qual Cliente voce quer acessar (1 a 10) digite (11) se quiser ver todos os clientes cadastrados ");
        System.out.print("\n Caso não queira acessar digite (12): ");

            int escolha = teclado.nextInt();         

            if (escolha == 1) {
                System.out.print("\n Nome: João Silva | E-mail: joao@email.com | Endereço: Rua A, 123 | Telefone: 11999998888 | CPF: 123.456.789-00 | CNPJ: 12.345.678/0001-90 | Razão Social: João Silva ME");
                
            } else if (escolha == 2) {
                System.out.print("\n Nome: Maria Oliveira | E-mail: maria@email.com | Endereço: Av. B, 456 | Telefone: 11988887777 | CPF: 987.654.321-00 | CNPJ: 98.765.432/0001-00 | Razão Social: Maria Oliveira EPP");
                
            } else if (escolha == 3) {
                System.out.print("\n Nome: Carlos Souza | E-mail: carlos@email.com | Endereço: Rua C, 789 | Telefone: 11977776666 | CPF: 111.222.333-44 | CNPJ: 11.222.333/0001-55 | Razão Social: CS Soluções Ltda");
                
            } else if (escolha == 4) {
                System.out.print("\n Nome: Ana Lima | E-mail: ana@email.com | Endereço: Rua D, 321 | Telefone: 11966665555 | CPF: 555.666.777-88 | CNPJ: 55.666.777/0001-22 | Razão Social: Ana Lima ME");
                
            } else if (escolha == 5) {
                System.out.print("\n Nome: Pedro Rocha | E-mail: pedro@email.com | Endereço: Av. E, 654 | Telefone: 11955554444 | CPF: 444.555.666-77 | CNPJ: 44.555.666/0001-33 | Razão Social: Rocha Tech");
                
            } else if (escolha == 6) {
                System.out.print("\n Nome: Fernanda Dias | E-mail: fernanda@email.com | Endereço: Rua F, 987 | Telefone: 11944443333 | CPF: 333.444.555-66 | CNPJ: 33.444.555/0001-44 | Razão Social: FD Serviços");
          
            } else if (escolha == 7) {
                System.out.print("\n Nome: Lucas Almeida | E-mail: lucas@email.com | Endereço: Av. G, 111 | Telefone: 11933332222 | CPF: 222.333.444-55 | CNPJ: 22.333.444/0001-11 | Razão Social: Almeida Corp");
                
            } else if (escolha == 8) {
                System.out.print("\n Nome: Patrícia Martins | E-mail: patricia@email.com | Endereço: Rua H, 222 | Telefone: 11922221111 | CPF: 666.777.888-99 | CNPJ: 66.777.888/0001-66 | Razão Social: PM Marketing");
                
            } else if (escolha == 9) {
                System.out.print("\n Nome: Ricardo Costa | E-mail: ricardo@email.com | Endereço: Av. I, 333 | Telefone: 11911110000 | CPF: 777.888.999-00 | CNPJ: 77.888.999/0001-77 | Razão Social: RC Logística");
                
            } else if (escolha == 10) {
                System.out.print("\n Nome: Juliana Pires | E-mail: juliana@email.com | Endereço: Rua J, 444 | Telefone: 11900009999 | CPF: 888.999.000-11 | CNPJ: 88.999.000/0001-88 | Razão Social: JP Consultoria");
                
                
            } else if (escolha == 11) {
                    System.out.print("\n Nome: João Silva | E-mail: joao@email.com | Endereço: Rua A, 123 | Telefone: 11999998888 | CPF: 123.456.789-00 | CNPJ: 12.345.678/0001-90 | Razão Social: João Silva ME");
                    System.out.print("\n Nome: Maria Oliveira | E-mail: maria@email.com | Endereço: Av. B, 456 | Telefone: 11988887777 | CPF: 987.654.321-00 | CNPJ: 98.765.432/0001-00 | Razão Social: Maria Oliveira EPP");
                    System.out.print("\n Nome: Carlos Souza | E-mail: carlos@email.com | Endereço: Rua C, 789 | Telefone: 11977776666 | CPF: 111.222.333-44 | CNPJ: 11.222.333/0001-55 | Razão Social: CS Soluções Ltda");
                    System.out.print("\n Nome: Ana Lima | E-mail: ana@email.com | Endereço: Rua D, 321 | Telefone: 11966665555 | CPF: 555.666.777-88 | CNPJ: 55.666.777/0001-22 | Razão Social: Ana Lima ME");
                    System.out.print("\n Nome: Pedro Rocha | E-mail: pedro@email.com | Endereço: Av. E, 654 | Telefone: 11955554444 | CPF: 444.555.666-77 | CNPJ: 44.555.666/0001-33 | Razão Social: Rocha Tech");
                    System.out.print("\n Nome: Fernanda Dias | E-mail: fernanda@email.com | Endereço: Rua F, 987 | Telefone: 11944443333 | CPF: 333.444.555-66 | CNPJ: 33.444.555/0001-44 | Razão Social: FD Serviços");
                    System.out.print("\n Nome: Lucas Almeida | E-mail: lucas@email.com | Endereço: Av. G, 111 | Telefone: 11933332222 | CPF: 222.333.444-55 | CNPJ: 22.333.444/0001-11 | Razão Social: Almeida Corp");
                    System.out.print("\n Nome: Patrícia Martins | E-mail: patricia@email.com | Endereço: Rua H, 222 | Telefone: 11922221111 | CPF: 666.777.888-99 | CNPJ: 66.777.888/0001-66 | Razão Social: PM Marketing");
                    System.out.print("\n Nome: Ricardo Costa | E-mail: ricardo@email.com | Endereço: Av. I, 333 | Telefone: 11911110000 | CPF: 777.888.999-00 | CNPJ: 77.888.999/0001-77 | Razão Social: RC Logística");
                    System.out.print("\n Nome: Juliana Pires | E-mail: juliana@email.com | Endereço: Rua J, 444 | Telefone: 11900009999 | CPF: 888.999.000-11 | CNPJ: 88.999.000/0001-88 | Razão Social: JP Consultoria");
                	
            } else if (escolha == 12) {
                     System.out.println("------------------------------------------------");
   
                
                } else {
                System.out.println("Número inválido. Digite de 1 a 12.");
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



