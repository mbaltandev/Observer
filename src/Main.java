import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Ders matematik=new Ders();
        BinaryObserver observer=new BinaryObserver(matematik);
        HexaObserver observer1=new HexaObserver(matematik);
        OctalObserver observer2=new OctalObserver(matematik);
        matematik.dersEkle();
        matematik.setDurum(31);

    }
}
