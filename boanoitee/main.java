package boanoitee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
	
	 public static void voltaraoMenu() {
			

	        String[] args = null;
	        main(args); 
	    }
    public static void main(String[] args) {
    	try {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--Bem vindo a nossa empresa-- ");
        System.out.println("Você quer acessar qual dos nossos menus?\n  1- Menu Cadastro de Funcionario \n 2- Menu Cadastro de Cliente \n 3- Menu de Valores do Salario \n 4- Menu de Produtos ");
        int escolha = teclado.nextInt();

        if (escolha == 1) {
            funcionarios.empresa4(teclado);
        } else if (escolha == 2) {
           clientes.empresa1(teclado);
        } else if (escolha == 3) {
            valores.empresa2(teclado);
        } else if (escolha == 4) {
            produtos.empresa3(teclado);
        }else {
            System.out.println("Seção inválida.");
        }

    } catch (InputMismatchException e) {
        System.out.println("Erro encontrado. Use numero inteiro. ");
    } catch (Exception e) {
        System.out.println("Erro inesperado: " + e.getMessage());
    } finally {
      
       
    }
}

}
