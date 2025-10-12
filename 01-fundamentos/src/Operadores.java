public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao =  "1"+(1+1+1);
        System.out.println(concatenacao);
//--------------------------------------------------------------------
        int numero = 5;

        numero = - numero;
        System.out.println(numero);

        numero =  numero * -1;
        System.out.println(numero);
//----------------------------------------------------------------------
        int numero2 = 1;
        System.out.println(++numero2);
//----------------------------------------------------------------------
        int a,b;
        a = 5;
        b = 6;

        if(a==b){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }

        System.out.println(a == b ? "Verdadeiro" : "Falso");
//------------------------------------------------------------------------
        int num01 = 1;
        int num02 = 2;

        boolean simNao = num01 == num02;
        System.out.println("num01 é igual a num02? " + (simNao ? "Sim" : "Não"));

        simNao = num01 != num02;
        System.out.println("num01 é diferente de num02? " + (simNao ? "Sim" : "Não"));

        simNao = num01 > num02;
        System.out.println("num01 é maior que num02? " + (simNao ? "Sim" : "Não"));

        simNao = num01 < num02;
        System.out.println("num01 é menor que num02? " + (simNao ? "Sim" : "Não"));


        String nomeUm = "Paulo";
        String nomeDois = new String("Paulo");

        System.out.println(nomeUm == nomeDois);

        System.out.println(nomeUm.equals(nomeDois));
//------------------------------------------------------------------------
        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && (7 > 4)) {
            System.out.println("As duas condiçoes são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeiras");
        }
    }
}
