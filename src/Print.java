public class Print {

    private String message;

    public Print(String message){
        this.message = message;
    }

    public Print doPrint(){
        return this;
    }
}
