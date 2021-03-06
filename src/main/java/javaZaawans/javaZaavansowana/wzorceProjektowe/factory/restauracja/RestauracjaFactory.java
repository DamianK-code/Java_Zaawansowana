package javaZaawans.javaZaavansowana.wzorceProjektowe.factory.restauracja;

public class RestauracjaFactory {

    public static Restauracja wybierzRestauracje(TypRestauracji typRestauracji){
        switch(typRestauracji){
            case MC_DONALD:
                return new McDonald();
            case KFC:
                return new Kfc();
            default:
                System.out.println("Dana restauracja nie istnieje.");
                throw new RuntimeException();
        }
    }
}
