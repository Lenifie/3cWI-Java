package at.stl.ISaHASa;

public class main {
    public static void main(String[] args) {
        Animal a1 = new Animal(40,20);
        Animal a2 = new Animal(50,30);

        Zoo z1 = new Zoo("Kinderzoo","Elefantenstrasse");
        z1.addAnimal(a1);
        z1.addAnimal(a2);
        z1.printAnimals();

        dog d1 = new dog(15,20);
        d1.bark();
        z1.addAnimal(d1);
        z1.printAnimals();
    }
}
