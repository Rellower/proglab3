import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Person {
    protected String name;
    protected int health; // 0-100
    protected EmotionalState emotion;
    protected List<Item> inventory;

    public Person(String name, int health) {
        this.name = name;
        this.health = health;
        this.emotion = EmotionalState.CALM;
        this.inventory = new ArrayList<>();
    }

    public String getName() { return name; }
    public boolean isAlive() { return health > 0; }
    
    // Абстрактный метод
    public abstract void performAction();

    public void takeItem(Item item) {
        inventory.add(item);
    }

    public VitalSigns checkVitals() {
        return new VitalSigns(60 + (health / 2), 34.0 + (health * 0.03));
    }

    @Override
    public String toString() {
        return String.format("Person{name='%s', health=%d, emotion=%s}", name, health, emotion);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return health == person.health && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, health);
    }
}