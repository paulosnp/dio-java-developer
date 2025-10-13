public class Metodos {

    public double somar(int num1, int num2){
        return num1 + num2;
    }

    public void imprimir(String texto){
        System.out.println(texto);
    }

    public double dividir(int dividendo, int divisor)throws Exception{
        return dividendo / divisor;
    }

    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }


}
