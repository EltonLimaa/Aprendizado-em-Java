import java.util.Scanner;

public class ContaBancariaSimulador {
    public static void main(String[] args) {
        //tipo de variaveis usadas
        Scanner ler = new Scanner(System.in);
        String a = "***********************************************************";
        String tipo_conta = "";
        double saldo_c = 4500;
        double saldo_p = 7000;
        int conta = 0;
        int op = 0;
        int contg = 0;
        int rep = 0;
        String log = "";
        String pass = "";
        String nome = "";
        int rep2 = 0;
        boolean user = false;
        boolean sessao = true;
        int contg1 = 0;
        double valor = 0;
        int rep1 = 0;
        int ct = 0;
        double tt = 0;

        System.out.println("Bem-vindo/a ao Banco Lima");
        while (sessao) {

            //erea de login e senha
            while (contg1 == 0 ) {
                System.out.println(a);
                System.out.println("Digite o Usuario: ");
                log = ler.nextLine();
                System.out.println("Digite a senha: ");
                pass = ler.nextLine();

                //usuarios ja cadatrados
                if (log.equals("neymar57") && pass.equals("akumaya")) {
                    nome = "Elton";
                    contg1 = 1;
                    user = true;
                } else if (log.equals("Odin") && pass.equals("19222527")) {
                    nome = "Emanuele";
                    contg1 = 1;
                    user = true;
                } else if (log.equals("Kevin562") && pass.equals("Travessa11")) {
                    nome = "Kevin";
                    contg1 = 1;
                    user = true;
                } else if (log.equals("Rodney55555") && pass.equals("Rodney55")) {
                    nome = "Rodney";
                    contg1 = 1;
                    user = true;
                } else if (log.equals("Kakashirim") && pass.equals("inf@liveL431")) {
                    nome = "Weslley";
                    contg1 = 1;
                    user = true;
                } else {
                    System.out.println("Usuario e/ou senha invalidos");
                    contg1 = 0;
                    user = false;
                }
            }

            //escolha da conta a ser acessada
            if(user) {
                while (rep2 < 2) {
                    System.out.println("""
                                qual o tipo da conta acessar:
                                1-corrente
                                2-poupança
                                """);
                    conta = ler.nextInt();
                    ler.nextLine();

                    if(conta == 1){
                        tipo_conta = "Corrente";
                        tt = saldo_c;
                        rep2 = 3;
                        contg = 1;
                    }else if(conta == 2 ){
                        tipo_conta = "Pouopança";
                        tt = saldo_p;
                        rep2 =  3;
                        contg = 1;
                    }else{
                        System.out.println("Operação invalida!");
                        rep2 = 0;
                    }
                }

                //tela inicial
                while (contg == 1) {
                    rep1 = 0;
                    System.out.println(String.format("""
                                    %s
                                    Tela Principal\n\n""", a));

                    System.out.println("nome do cliente:     " + nome);
                    System.out.println("tipo Conta:          " + tipo_conta);
                    System.out.println(String.format("""
                                    saldo em conta:      R$*****
                                    %s
                                    operações que deseja realizar
                                    
                                    1-consulta extrato
                                    2-mudar conta
                                    3-transferencia de valor
                                    4-sair""", a));
                    //Operações
                    op = ler.nextInt();
                    ler.nextLine();

                    //Acessa o extrato bancario
                    if (op == 1) {

                        System.out.println(String.format("""
                                        %s
                                        Extrato bancario
                                        
                                        Conta:     %s
                                        saldo:     R$ %.2f
                                        """, a, tipo_conta, tt));

                        System.out.println("""
                                        Oque deseja fazer:
                                        
                                        1.voltar ao menu principal
                                        2.encerrar""");
                        int op1 = ler.nextInt();
                        ler.nextLine();
                        if (op1 == 1) {
                            contg = 1;
                        } else if (op1 == 2) {
                            sessao = false;
                            break;
                        }

                        //operação voltada para trocar de conta(Corrente e Poupança)
                    } else if (op == 2) {
                            while (rep == 0) {
                                System.out.println(a);
                                System.out.println("Qual conta deseja acessar: \n1.conta corrente \n2.conta poupança");
                                conta = ler.nextInt();
                                ler.nextLine();
                            if (conta == 1) {
                                tipo_conta = "Corrente";
                                tt = saldo_c;
                                rep = 2;
                                contg = 1;
                            } else if (conta == 2) {
                                tipo_conta = "Poupança";
                                tt = saldo_p;
                                rep = 2;
                                contg = 1;
                            } else {
                                System.out.println("Operação invalida");
                                rep = 0;
                            }}

                            //realiozar movimentações na conta
                    } else if (op == 3) {
                        while(rep1 < 2) {
                            System.out.println(String.format("""
                                    %a
                                    Qual conta deseja usar:
                                    1.corrente
                                    2.poupança
                                    """, a));
                            ct = ler.nextInt();
                            ler.nextLine();
                            if(ct == 1){
                                System.out.println("conta escolhida:     Corrente");
                            }else{
                                System.out.println("Conta escolhida:     Poupança");
                            }
                            System.out.println("\nQual valor da transferencia em R$: ");
                            valor = ler.nextDouble();
                            System.out.println(String.format("Será transferido R$%.2f da sua conta %s",valor, ct));
                            if(ct == 1) {
                                if(valor < saldo_c){
                                saldo_c = saldo_c - valor;
                                tt = saldo_c;
                                contg = 1;
                                rep1 = 3;
                                }else{
                                    System.out.println(String.format("""
                                Saldo insuficiente
                                saldo:     %.2f
                                %s""",saldo_c, a));
                                    rep1 = 0;
                                }
                            } else if(ct == 2) {
                                if(valor < saldo_p) {
                                    saldo_p = saldo_p - valor;
                                    tt = saldo_p;
                                    contg = 1;
                                    rep1 = 3;
                                }else{
                                    System.out.println(String.format("""
                                Saldo insuficiente
                                saldo:     %.2f
                                %s""",saldo_p, a));
                                    rep1 = 0;
                                }
                            }else{
                                System.out.println("Operação invalida");
                                rep1 = 0;
                            }
                        }

                        //encerra o codigo
                    } else if (op == 4) {
                        return ;
                    }else{
                        System.out.println("Operação invalida!");
                    }
                }
            }
        }
    }
}

