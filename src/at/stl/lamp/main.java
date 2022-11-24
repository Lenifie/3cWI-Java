package at.stl.lamp;

public class main {
    public static void main(String[] args) {

        glowingElements g1 = new glowingElements("Glue1","blau",12,false);
        glowingElements g2 = new glowingElements("Glue2","rot", 15,false);
        lamp l1 = new lamp();
        l1.addGlowingElement(g1);
        l1.addGlowingElement(g2);

        l1.turnAllOn();
        l1.printNamesOfLightElements();
        l1.getOverallPowerUsage();

    }
}
