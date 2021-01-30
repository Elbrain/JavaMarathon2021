package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private final int physAtt;
    private final int magicAtt;

    public Magician() {
        super.setPhysDef(0);
        super.setMagicDef(80);
        this.physAtt = 5;
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

    @Override
    public void physicalAttack(Hero hero) {
        double actualDef = 0;
        if (hero.getPhysDef() > 0) {
            actualDef = (double) hero.getPhysDef() / 100;
        }
        hero.setHealth((int) (hero.getHealth() - (physAtt - (physAtt * actualDef))));
    }
}
