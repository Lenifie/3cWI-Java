package at.stl.ISaHASa;

public class dog extends Animal{
    public dog(int weight, int height) {
        super(weight, height);
    }

    public void bark(){
        System.out.println("Wuff");
    }
}
