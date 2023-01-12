package at.stl.camera;

public class main {
    public static void main(String[] args) {
        SDCard s1 = new SDCard(16);
        ManufacturerCamera mc1 = new ManufacturerCamera("Canon","Austria");
        ManufacturerLens ml1 = new ManufacturerLens("Hubu", "Indonesia");
        Lens l1 = new Lens(250, ml1);
        camera c1 = new camera(140,12,"blue", camera.RESOLUTION.s,s1,l1, mc1);
        Picture p1 = new Picture("Pic1","12.1.2023");
        Picture p2 = new Picture("Pic2", "11.1.2023");
        Picture p3 = new Picture("Pic3", "10.1.2023");
        Picture p4 = new Picture("Pic4", "9.1.2023");
        Picture p5 = new Picture("Pic5", "8.1.2023");

        c1.takePic(p1);
        c1.takePic(p2);
        c1.takePic(p3);
        c1.takePic(p4);
        c1.takePic(p5);
        s1.getAllFiles();

    }
}
