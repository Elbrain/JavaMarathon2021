package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {

    private final int physAtt;
    private final int magicAtt;
    private final int HEAL_HIMSELF = 50;
    private final int HEAL_TEAMMATE = 30;

    public Shaman() {
        super.setPhysDef(20);
        super.setMagicDef(20);
        this.physAtt = 10;
        this.magicAtt = 15;
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
