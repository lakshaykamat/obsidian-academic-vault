public class MyException extends Exception{
    public MyException(){
        super();
    }

    public MyException(String message){
        super("Error: Number should be less than 100");
    }
    
}
