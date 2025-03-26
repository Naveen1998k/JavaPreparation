package FinalKeyword;

public class BlankFinalVar {
    final int x;
    BlankFinalVar(int a){
        x=a;
    }

    public BlankFinalVar() {
        x=0;
    }

    public static void main(String[] args) {
        BlankFinalVar obj = new BlankFinalVar(10);
        System.out.println(obj.x);
    }
}

