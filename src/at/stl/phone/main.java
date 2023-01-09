package at.stl.phone;

public class main {
    public static void main(String[] args) {
        sim s1 = new sim(1234,"+42 680321286");
        SDCard sd1 = new SDCard(5000);
        camera c1 = new camera("4K");
        phone p1 = new phone("blue",s1,sd1,c1);

        PhoneFile f1 = new PhoneFile("pic1","jpg", 1000);
        PhoneFile f2 = new PhoneFile("pic2","jpg", 1001);
        PhoneFile f3 = new PhoneFile("pic3","jpg", 1002);

        p1.makeCall();
        p1.takePicture(f1);
        p1.takePicture(f2);
        p1.takePicture(f3);
        p1.printAllFiles();


        sd1.getCapacity();
        p1.getFreeSpace(f3);
        p1.getFreeSpace(f1);
        sd1.getCapacity();
    }
}
