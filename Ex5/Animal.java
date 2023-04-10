package Ex5;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean tailb;

    public Animal() {
        this.name = "Васька";
        this.age = 45;
        this.tailb = false;
    }

    @Override
    public String toString() {
        String tailString = tailb ? "так" : "ні";
        return "Ім'я = " + name +
                ", вік = " + age +
                ", хвіст = " + tailString;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Animal animal)) return false;
        return age == animal.age &&
                tailb == animal.tailb &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tailb);
    }
}
