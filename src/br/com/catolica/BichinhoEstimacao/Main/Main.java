package br.com.catolica.BichinhoEstimacao.Main;

import br.com.catolica.BichinhoEstimacao.Model.Animais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op = 0;

        try {
            System.out.print("Crie o seu novo animal \nInsira o nome: ");
            String nome = scan.nextLine();
            System.out.print("Insira a classe: ");
            String classe = scan.nextLine();
            System.out.print("Insira a familia: ");
            String familia = scan.nextLine();

            Animais a1 = new Animais(nome, classe, familia);
            System.out.println(a1.nasceu());


            while (op != 4) {
                System.out.println("O que o " + a1.getNome() + " Vai fazer agora?"
                        + "\n1 - Comer\n2 - Correr\n3 - Dormir\n4 - Morrer");
                op = scan.nextInt();
                switch (op) {
                    case 1:
                        System.out.println(a1.comer());
                        break;
                    case 2:
                        System.out.println(a1.correr());
                        break;
                    case 3:
                        System.out.println(a1.dormir());
                        break;
                    case 4:
                        System.out.println(a1.morrer());
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor tente novamente!");
                }

            }
            System.out.println("GAMER OVER");
        }catch (Exception erro){
            System.out.println("Error: " + erro.getMessage());
        }finally {
            scan.close();
        }
    }
}
