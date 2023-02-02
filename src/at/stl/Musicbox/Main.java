package at.stl.Musicbox;

public class Main {
    public static void main(String[] args) {

      Title t1 = new Title("Entchen", 2.4);
      Title t2 = new Title("Entchen2", 5.4);
      Title t3 = new Title("Entchen3", 2.7);
      Title t4 = new Title("Entchen4", 1.4);

      Record r1 = new Record(1,"Record1");
      Record r2 = new Record(2,"Record2");

      r1.addTitle(t1);
      r1.addTitle(t2);

      r2.addTitle(t3);
      r2.addTitle(t4);
      r2.getSumOfMusic();
      System.out.println("----------");
      Musicbox m1 = new Musicbox();
      m1.addRecord(r1);
      m1.removeRecord(r1);
      m1.addRecord(r2);
      m1.getSumOfMusic();
      m1.searchRecord(t4);
      System.out.println("----------");
      Player p1 = new Player();
      p1.loadRecord(r2);
      p1.play(0);


    }
}
