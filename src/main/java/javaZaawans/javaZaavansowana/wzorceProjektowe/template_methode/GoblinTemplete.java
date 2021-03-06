package javaZaawans.javaZaavansowana.wzorceProjektowe.template_methode;

public abstract class GoblinTemplete {
    public abstract int silaBohatera();


    public abstract int mocBohatera();

    public int silaAtakuGoblina() {
        return 3 * silaBohatera() + 10 * mocBohatera();
    }
}
