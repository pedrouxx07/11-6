package boanoitee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class valores {

    public static void empresa2(Scanner teclado) {
    	try {
        System.out.println("----Valores-----");

        int ganhoDia = 40;

        System.out.println("Adicione o seu salário base:");
        double salario = Double.parseDouble(teclado.nextLine());

        System.out.println("Adicione quantos dias voce trabalhou:");
        int diasTrabalhados = Integer.parseInt(teclado.nextLine());

        double receberSalario = diasTrabalhados * ganhoDia;
        double descontoSalario = salario - receberSalario;

        System.out.println("Salário Base: " + salario);
        System.out.println("Dias Trabalhados: " + diasTrabalhados);
        System.out.println("Salário a Receber: " + receberSalario);
        
        
        if (diasTrabalhados == 30) {
            System.out.println("Desconto no salário: Sem Desconto");
        } else {
            System.out.println("Desconto no salário: " + descontoSalario);
        }
        

        if (diasTrabalhados == 30) {
            System.out.println("Folga: Sem folga");
        } else {
            System.out.println("Folga: Com folga");
        }
   
    
       if (diasTrabalhados == 30) {
          System.out.println("Tipo: Salário Cheio");
       } else {
        System.out.println("Tipo: Salário Descontado");
       }
       
    
} catch (InputMismatchException e) {
    System.out.println("Erro encontrado. Use numero inteiro. ");
} catch (Exception e) {
    System.out.println("Erro inesperado: " + e.getMessage());
} finally {
  
}
}

    }
