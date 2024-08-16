package ra.bt1;

public class Dog extends Animal{
    private String color;
    private String name;

    public Dog(String type, int weight) {
        super(type, weight);
    }

    public Dog(String type, int weight, String color, String name) {
        super(type, weight);
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sua(){
        System.out.println(this.getName()+ this.getColor()+this.getType());
    }
}
