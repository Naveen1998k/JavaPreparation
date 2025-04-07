package Exception;

public class TryWithResource {

    public static void main(String[] args) {
        DataBaseResourse dbResource = new DataBaseResourse();
        FileResource fileResource = new FileResource();
        try(dbResource;fileResource){
            System.out.println("Using resources");
            System.out.println(10/0);

            System.out.println("Try block ended");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
