package FunctionalInterFace;
class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class Accept<T>{


    T obj;
    public Accept(T obj){
        this.obj=obj;
    }

    public T getObj() {
        return this.obj;
    }
}
public class TypeParameter {
    public static void main(String[] args) {
        Accept<Integer> accInt=new Accept<Integer>(90);
        System.out.println(accInt.getObj());

        Accept<Double> accDou=new Accept<>(90.89);
        System.out.println(accDou.getObj());

        Accept<Boolean> accBol=new Accept<>(true);
        System.out.println(accBol.getObj());

        Accept<Student> accStu=new Accept<>(new Student(100,"Naveen"));

        System.out.println(accStu.getObj());
    }
}
