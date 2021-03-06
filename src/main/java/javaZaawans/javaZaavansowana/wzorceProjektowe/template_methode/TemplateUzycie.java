package javaZaawans.javaZaavansowana.wzorceProjektowe.template_methode;

public class TemplateUzycie {
    public static void main(String[] args) {
        HeroTemplate mocnyBohater =  new SuperHeroTemplate();
        HeroTemplate slabyBohater = new SlabyHeroTemplate();
        HeroTemplate megaBohater = new MegaHiro();
        GoblinTemplete slabyGoblin = new SlabyGoblin();
        GoblinTemplete gorskiGoblin = new GorskiGoblin();
        System.out.println("Moc ataku slabego Hero rowna: " + slabyBohater.silaAtakuBohatera());
        System.out.println("Moc ataku mocnego Hero rowna: " + mocnyBohater.silaAtakuBohatera());
        System.out.println("Moc ataku mega Hero rowna: " + megaBohater.silaAtakuBohatera());
        System.out.println("Moc ataku slabego goblina rowna: " + slabyGoblin.silaAtakuGoblina());
        System.out.println("Moc ataku górskiego goblina  rowna: " + gorskiGoblin.silaAtakuGoblina());

        walka(megaBohater,gorskiGoblin);
    }
    private static void walka(HeroTemplate hero, GoblinTemplete goblin) {
        if (hero.silaAtakuBohatera() > goblin.silaAtakuGoblina()) {
            System.out.println("Wybrał bohater");
        } else {
            System.out.println("Wybrał goblin");
        }
    }
}
