public class HorarioDoDia {

    public static void mensagemDia(int hora){

        switch (hora) {

            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("bom dia!");
                break;

            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("boa tarde!");
                break;

            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                System.out.println("boa noite!");
                break;

            default:
                System.out.println("hora invalida!");
                break;
        }
    }

    @Override
    public String toString() {
        return "pingo";
    }
}

