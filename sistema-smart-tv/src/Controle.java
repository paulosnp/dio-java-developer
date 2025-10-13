import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartTV smartTv = new SmartTV();

        while (true) {
            System.out.println("-----Status da SmartTV-----");
            System.out.println("Tv Ligada?:" + (smartTv.ligada ? " Sim" : " Não"));

            if(smartTv.ligada) {
                System.out.println("Canal Atual:" + smartTv.canal);
                System.out.println("Volume Atual:" + smartTv.volume);
            }
            System.out.println("---------------------------");

            if(smartTv.ligada){
                        System.out.println("-----------Opções:");
                        System.out.println("1..... Mudar Canal");
                        System.out.println("2.. Aumentar Canal");
                        System.out.println("3.. Diminuir Canal");
                        System.out.println("4. Aumentar Volume");
                        System.out.println("5. Diminuir Volume");
                        System.out.println("6..... Desligar TV");
                        System.out.println("7. Fechar Programa");
                        System.out.print("Opção:");

                        int opcao = sc.nextInt();
                        switch (opcao) {
                            case 1:
                                System.out.print("Novo Canal:");
                                int novoCanal = sc.nextInt();
                                smartTv.mudarCanal(novoCanal);
                                break;
                            case 2:
                                smartTv.aumentarCanal();
                                break;
                            case 3:
                                smartTv.diminuirCanal();
                                break;
                            case 4:
                                smartTv.aumentarVolume();
                                break;
                            case 5:
                                smartTv.diminuirVolume();
                                break;
                            case 6:
                                smartTv.desligar();
                                System.out.println("TV Desligada");
                                break;
                            case 7:
                                break;
                            default:
                                System.out.println("Opção Inválida");
                        }
                        if (opcao == 7){
                            break;
                        }

            }else{
                System.out.print("Deseja Ligar a TV? (Sim/Não):");
                String resposta = sc.next();

                if(resposta.equalsIgnoreCase("sim")){
                    smartTv.ligar();
                    System.out.println("TV Ligada");
                    System.out.println("---------------------------");

                } else if (resposta.equalsIgnoreCase("não") || resposta.equalsIgnoreCase("nao")) {
                    break;
                }
            }
        }
        System.out.println("Programa Finalizado");
        sc.close();
    }
}
