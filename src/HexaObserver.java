public class HexaObserver extends AbsObserver{

    public HexaObserver(Ders ders){
        this.ders = ders;
        this.ders.dersEkle(this);
    }

    @Override
    public void guncelle() {
        System.out.println( "Hex String: " + Integer.toHexString( ders.getDurum() ).toUpperCase() );
    }
}