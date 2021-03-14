package structural.adapter;

public class AdapterJavaToDataBase extends JavaApplication implements DataBase {
    public void insert() {
        saveObject();
    }

    public void update() {
        updateObject();
    }

    public void remove() {
        deleteObject();
    }

    public void select() {
        loadObject();
    }
}
