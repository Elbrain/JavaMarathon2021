package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {

    private final int physAtt;
    private final int HEAL_HIMSELF = 25;
    private final int HEAL_TEAMMATE = 10;

    public Paladin() {
        super.setPhysDef(50);
        super.setMagicDef(20);
        this.physAtt = 15;
    }

    @Override
    public void healHimself() {
        this.setHealth(Math.min(this.getHealth() + HEAL_HIMSELF, 100)); // setup health cap at 100;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() + HEAL_TEAMMATE < 100)
            this.setHealth(hero.getHealth() + HEAL_TEAMMATE); // setup health cap at 100;
        else hero.setHealth(100);
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
