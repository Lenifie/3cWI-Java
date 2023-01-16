package at.stl.camera;

public class main {
    public static void main(String[] args) {
        SDCard s1 = new SDCard(16);
        ManufacturerCamera mc1 = new ManufacturerCamera("Canon","Austria");
        ManufacturerLens ml1 = new ManufacturerLens("Hubu", "Indonesia");
        Lens l1 = new Lens(250, ml1);
        Camera c1 = new Camera(140,12,"blue", Camera.RESOLUTION.s,s1,l1, mc1);


        c1.takePic();
        c1.takePic();
        c1.takePic();

        s1.getAllFiles();

    }
}
