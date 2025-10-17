package EstruturasCondicionais;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "t";
        plano = plano.toUpperCase();

        switch (plano) {
            case "T":
                System.out.println("5Gb Youtube");
            case "M":
                System.out.println("Whats e Instagram grátis");
            case "B":
                System.out.println("100 minutos de ligação");
                break;
            default:
                System.out.println("Plano Inválido");
                break;
        }

    }
}
