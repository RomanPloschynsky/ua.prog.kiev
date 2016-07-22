/**
 * Created by exite on 19.07.16.
 */
public class Dog {
    private String name;
    private String ownerName;

    public Dog(String name, String ownerName) {

            Validator.chackName(name);
            Validator.chackName(ownerName);

            this.name = name;
            this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Validator.chackName(name);
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        Validator.chackName(ownerName);
        this.ownerName = ownerName;
    }

    public void bark() {
        System.out.println(name + " is barking. " + ownerName + " are happy.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
