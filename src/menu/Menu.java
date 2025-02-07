package menu;

import implementation.Iphone;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Iphone iphone = new Iphone();

    public void menuEspecifico(Integer op){
        switch (op){
            case 1:
                internetMenu();
                break;
            case 2:
                playerMusicaMenu();
                break;
            case 3:
                telefoneMenu();
                break;
            default:
                System.out.println("Escolha uma opção valida!");
        }
    }

    public void telefoneMenu(){
        int limiter = 1;
        while (limiter != 0){
            System.out.println("MENU MUSICA");
            System.out.println("1 Ligar");
            System.out.println("2 Atender");
            System.out.println("3 Iniciar correio de voz");
            System.out.println("4 - Sair");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    System.out.println("Numero para ligar: ");
                    iphone.ligar(sc.nextLine());
                    break;
                case 2:
                    iphone.atender();
                    break;
                case 3:
                    iphone.iniciarCorreioVoz();
                    break;
                case 4:
                    limiter = 0;
                default:
                    System.out.println("Digite uma opção valida!");
                    break;
            }
        }
    }

    public void playerMusicaMenu(){
        int limiter = 1;
        while (limiter != 0){
            System.out.println("MENU MUSICA");
            System.out.println("1 Tocar musica");
            System.out.println("2 Pausar musica");
            System.out.println("3 Selecionar musica");
            System.out.println("4 - Sair");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    iphone.tocar();
                    break;
                case 2:
                    iphone.pausar();
                    break;
                case 3:
                    System.out.println("Informe a musica: ");
                    iphone.selecionarMusica(sc.nextLine());
                    break;
                case 4:
                    limiter = 0;
                default:
                    System.out.println("Digite uma opção valida!");
                    break;
            }
        }
    }

    public void internetMenu(){
        int limiter = 1;
        while (limiter != 0){
            System.out.println("MENU INTERNET");
            System.out.println("1 Exibir pagina");
            System.out.println("2 Adicionar nova aba");
            System.out.println("3 Atualizar pagina");
            System.out.println("4 - Sair");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    System.out.println("Informe o site: ");
                    String url = sc.nextLine();
                    iphone.exibirPagina(url);
                    break;
                case 2:
                    iphone.adicionarNovaAba();
                    break;
                case 3:
                    iphone.atualizarPagina();
                    break;
                case 4:
                    limiter = 0;
                default:
                    System.out.println("Digite uma opção valida!");
                    break;
            }
        }
    }
}
