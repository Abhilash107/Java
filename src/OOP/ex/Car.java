package OOP.ex;

public class Car {
    //Model, color, edition, Brand, speed
    private String model;
    private String brand;
    private String color;

    private int edition;//Encapsulation using private keyword
    private int speed;
    //As encapsulation has been applied to all members of the class, so we can access each by using getters and setters.


    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setEdition(int yr){
        this.edition = yr;
    }

    public String getModel(){
        return  this.model;
    }
    public String getColor(){
        return  this.color;
    }
    public String getBrand(){
        return  this.brand;
    }
    public int getEdition(){
        return  this.edition;
    }

    public void accelerate(int inc){
        speed += inc;
    }
    public void decelerate(int dec){
        speed -= dec;
    }


    public void display(){
        System.out.println(model + " " + brand+ " " + color+" "+ edition+ " "+ speed);
    }




}
