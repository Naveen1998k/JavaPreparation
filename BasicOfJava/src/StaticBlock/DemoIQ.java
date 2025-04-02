package StaticBlock;
class AA{

    static {
        System.out.println("Static block of AA");
    }

    {
        System.out.println("Instance block of AA");
    }

    AA(){
        System.out.println("Constructor of AA");
    }
}
class BB extends AA{

    static {
        System.out.println("Static block of BB");
    }

    {
        System.out.println("Instance block of BB");
    }

    BB(){
        System.out.println("Constructor of BB");
    }
}
public class DemoIQ {
    public static void main(String[] args) {
        BB obj = new BB();
    }
}
