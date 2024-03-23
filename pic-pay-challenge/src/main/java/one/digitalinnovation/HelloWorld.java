package one.digitalinnovation;

public class HelloWorld {
    private String message;
    public HelloWorld(String message){
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public boolean verifyMessage()
    {
        if (getMessage().equals("Hello World")) {
            return true;
        }
        return false;
    }
}
