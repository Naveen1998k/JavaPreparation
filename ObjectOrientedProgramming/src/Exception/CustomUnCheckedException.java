package Exception;
@SuppressWarnings("serial")
public class CustomUnCheckedException extends RuntimeException {
    public CustomUnCheckedException(String message) {
        super(message);
    }

    public CustomUnCheckedException() {

    }
}
