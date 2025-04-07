package Exception;

import java.io.Closeable;
import java.io.IOException;

public class FileResource implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Closing file resource");
        // Simulate an IOException
        //throw new IOException("Error closing file resource");
    }
}
