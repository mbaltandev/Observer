public class BinaryObserver extends AbsObserver{

    public BinaryObserver(Ders ders){
        this.ders = ders;
        this.ders.dersEkle(this);
    }

    @Override
    public void guncelle() {
        System.out.println( "Binary String: " + Integer.toBinaryString( ders.getDurum() ) );
    }
}