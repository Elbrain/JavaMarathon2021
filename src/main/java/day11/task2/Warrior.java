package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    private final int physAtt;

    public Warrior() {
        super.setPhysDef(80);
        super.setMagicDef(0);
        this.physAtt = 30;
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
