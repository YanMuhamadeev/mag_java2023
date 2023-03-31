package labs.lab2.animal;

public class Bird extends Animal{
    private String bread;
    private boolean isFlying;

    public Bird(String name, int age, String bread, boolean isFlying) {
        super(name, age);
        this.bread = bread;
        this.isFlying = isFlying;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    @Override
    public void makeNoise() {
        System.out.println("Bird makes noises");
    }
}
