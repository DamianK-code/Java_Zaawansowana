package javaZaawans.javaZaavansowana.wzorceProjektowe.chainOfResponsibility;

public class MagazynWłochy implements MagazynHandler{

    @Override
    public boolean sprawdzDostępnośćProduktu(Produkt produkt) {
        switch(produkt){
            case TABLET:
            case NOWY_TABLET:
                System.out.println("Produkt " + produkt + " jest dostepny we Włoszech");
                return Boolean.TRUE;
            default:
                System.out.println("Produkt " + produkt + " jest niedostepny wwe Włoszech");
                return sprawdzWNastepnymMagazynie(produkt);
        }
    }

    private boolean sprawdzWNastepnymMagazynie(Produkt produkt) {
        MagazynHiszpania magazynHiszpania =  new MagazynHiszpania();
        return magazynHiszpania.sprawdzDostępnośćProduktu(produkt);
    }
}
