package Ploymorphism.MethodOverriding;


class RBI {
    public void loan() {
        System.out.println("Every Bank provides loan");
    }
}
class SBI extends RBI {
    public void loan() {
        System.out.println("SBI provides loan");
    }
}
class ICI extends RBI {
    public void loan() {
        System.out.println("ICI provides loan");
    }
}class HDFC extends RBI {
    public void loan() {
        System.out.println("HDFC provides loan");
    }
}
public class RBIDemo {

    public static void main(String[] args) {
        RBI rbi = new RBI();
        rbi.loan();
        rbi = new SBI();
        rbi.loan();
        rbi = new ICI();
        rbi.loan();
        rbi = new HDFC();
        rbi.loan();
    }
}
