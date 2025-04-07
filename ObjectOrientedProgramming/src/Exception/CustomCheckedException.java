package Exception;

@SuppressWarnings("serial")
public class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }

    public CustomCheckedException(){

    }
}
