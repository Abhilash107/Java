package AccessModifier.zoo;

public class Dog extends Animal{
    public Dog(String name){
        super(name, "bark");
    }

    public void wagTail(){
        System.out.println(getName());

    }

    public String getName(){
        return getClass().getSimpleName();
    }

    public void setSound(String newSound){
        changeSound(newSound);
    }
}
