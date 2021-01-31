package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private final int magicAtt;

    public Magician() {
        super.setPhysDef(0);
        super.setMagicDef(80);
        super.setPhysAtt(5);
        this.magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double actualDef = 0;
        if (hero.getMagicDef() > 0) {
            actualDef = (double) hero.getMagicDef() / 100;
        }
        hero.setHealth((int) (hero.getHealth() - (magicAtt - (magicAtt * actualDef))));
    }
}
