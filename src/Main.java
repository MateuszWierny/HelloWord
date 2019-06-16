public class Main {

    public static void main(String[] args) {
        String localmassage = " Hello Word ";
        print( localmassage );

        Print print = new Print( " Hello " );

        System.out.println(print.doPrint());
    }

    public static void print(String massage){
        System.out.println( massage );
    }
}
