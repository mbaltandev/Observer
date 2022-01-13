import java.util.ArrayList;
import java.util.List;

public class Ders {

    private List<AbsObserver> observers=new ArrayList<AbsObserver>();
    private int durum;
    public void dersEkle(AbsObserver absObserver){
        observers.add(absObserver);
    }
    public int getDurum() {
        return durum;
    }

    public void setDurum(int durum) {
        this.durum = durum;
        observerlarıBilgilendir();
    }

    private void observerlarıBilgilendir() {
        for (AbsObserver observer:observers){
            observer.guncelle();
        }
    }


}
