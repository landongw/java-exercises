package exercises.shapes;

public abstract class AbstractEntity {

    public static int id;
    private static int nextId;

    public AbstractEntity() {
        this.id = nextId++;
    }
}
