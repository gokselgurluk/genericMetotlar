import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyList <Integer> liste  = new MyList<>(10);
        System.out.println("Dizideki Eleman Sayisi : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(50);
        System.out.println("Dizideki Eleman Sayisi : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);
        System.out.println("Dizideki Eleman Sayisi : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        System.out.println("############################################");
        System.out.println("Dizinin  5. İndeksdeki Elemanı : " + liste.get(5));
        System.out.println("Dizinin 15. İndeksdeki Elemanı : " + liste.get(15));
        System.out.println("############################################");
        System.out.println("Dizinin Silinen Elemanı : " + liste.remove(4));
        System.out.println("Dizinin Kapasitesi : " + liste.toString());
        System.out.println("############################################");
        System.out.println("Dizinin Elamanının indeksi : " + liste.indexOf(60));
        System.out.println(" Elamanının  Buldugu Listede Boyutu : " + liste.lastIndexOf(60));
        System.out.println("############################################");
        System.out.println(" Liste Durumu: " + (liste.isEmpty()?"Boş":"Dolu"));

        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = liste.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

        // Liste veri türünde alt bir liste oluşturdu
        MyList<Integer> altListem = liste.sublist(0, 3);
        System.out.println(altListem.toString());

        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + liste.contains(20));
        System.out.println("Listemde 120 değeri : " + liste.contains(120));

        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        liste.clear();
        System.out.println(liste.toString());

    }
}
