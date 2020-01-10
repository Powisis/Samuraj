public class Statistics extends Draw{

    private static void statystykaNaCzwartek(){

    }

    public static void statystykaNaJedenDzień(String dzień){
        switch (dzień){
            case "poniedziałek":
                System.out.println("W poniedziałek najczęściej wylosowany był: ");
                break;
            case "wtorek":
                System.out.println("We wtorek najczęściej wylosowany był: ");
                break;
            case "środa":
                System.out.println("W środę najczęściej wylosowany był: ");
                break;
            case "czwartek":
                System.out.println("W czwartek najczęściej wylosowany był: ");
                break;
            case "piątek":
                System.out.println("W piatek najczęściej wylosowany był: ");
                break;
            case "sobota":
                System.out.println("W sobotę najczęściej wylosowany był: ");
                break;
            case "niedziela":
                System.out.println("W niedzielę najczęściej wylosowany był: ");
                break;
            case "default":
                System.exit(0);

        }
    }
}
