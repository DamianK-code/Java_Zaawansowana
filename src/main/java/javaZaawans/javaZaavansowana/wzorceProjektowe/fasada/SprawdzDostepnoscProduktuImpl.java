package javaZaawans.javaZaavansowana.wzorceProjektowe.fasada;

public class SprawdzDostepnoscProduktuImpl implements SprawdzenieDostepnosciProduktu {
    @Override
    public boolean czyJestDostepny(Produkt produkt) {
        if(produkt.equals(Produkt.KOSMETYKI)){
            System.out.println("Produkt " + produkt + " jest niedostępny");
            return false;
        }else if (produkt.equals(Produkt.MASECZKI)) {
            System.out.println("Produkt: " + produkt + " jest dostępny ");

            return true;
        }
        return true;
    }
}
