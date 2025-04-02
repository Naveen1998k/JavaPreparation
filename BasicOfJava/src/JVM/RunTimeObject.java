package JVM;
class Vijayawada{
    public void display(){
        System.out.println("Vijayawada");
    }
}
public class RunTimeObject {
    public static void main(String[] args) throws Exception {
      Object obj=  Class.forName("JVM.Vijayawada").newInstance();

        if(obj instanceof Vijayawada){
            Vijayawada vijayawada=(Vijayawada)obj;
            vijayawada.display();
        }
    }

}
