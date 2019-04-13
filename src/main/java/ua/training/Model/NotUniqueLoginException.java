package ua.training.Model;

public class NotUniqueLoginException extends Exception{
    private String reason;
    public NotUniqueLoginException(){
        super();
    }
    NotUniqueLoginException(String descr){
        super();
        reason = descr;
    }
    public String getReason() {
        return reason;
    }
}
