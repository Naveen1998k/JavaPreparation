package ObjectClassMethods;

public class Manager {

    private int id;
    private String name;

    public Manager(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }

        if(obj instanceof Manager) {
            Manager m = (Manager) obj;
            if(this.id == m.id && this.name.equals(m.name)) {
                return true;
            }
        }

        return false;
    }
}
