package Exception;

public class DataBaseResourse implements AutoCloseable{


    @Override
    public void close() throws Exception {
        System.out.println("Closing database connection");
    }
}
