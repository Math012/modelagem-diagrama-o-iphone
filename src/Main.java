import menu.Menu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        int op = 1;
        while (op != 0){
            System.out.println("MENU IPHONE");
            System.out.println("1 Navegador de internet");
            System.out.println("2 Player de musica");
            System.out.println("3 Telefone");
            System.out.println("4 - Sair");
            int escolha = sc.nextInt();
            if (escolha == 4){
                op = 0;
            }else {
                menu.menuEspecifico(escolha);
            }
        }
    }
}