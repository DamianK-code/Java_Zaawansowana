package javaZaawans.javaZaavansowana.wzorceProjektowe.fasada;

public class FasadaUzycie {
    public static void main(String[] args) {
        ZamówienieProduktuFasada zamówienieProduktuFasada =  new ZamówienieProduktuFasada(new SprawdzDostepnoscProduktuImpl(), new OplacenieProduktuImpl(), new DostarczenieProduktuImpl());
        zamówienieProduktuFasada.zamówienie(Produkt.KOSMETYKI);
    }
}
