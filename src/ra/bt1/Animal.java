package ra.bt1;

public class Animal {
    private String type;
    private int weight;

    public Animal() {
    }

    public Animal(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void showData(){
        System.out.println("type:"+ this.getType()+"weight:"+this.getWeight());
    }
}
