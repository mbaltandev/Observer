public class OctalObserver extends AbsObserver {

    public OctalObserver(Ders ders) {
        this.ders = ders;
        this.ders.dersEkle(this);
    }

    @Override
    public void guncelle() {
        System.out.println( "Octal String: " + Integer.toOctalString( ders.getDurum() ) );
    }
}
