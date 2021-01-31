package day11.task2;

public abstract class Hero implements PhysAttack {
    private int health;
    private int physDef; //процент поглощения физического урона
    private int magicDef; //процент поглощения магического урона
    private int physAtt;

    public Hero() {
        this.health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double actualDef = 0;
        if (hero.getPhysDef() > 0) {
            actualDef = (double) hero.getPhysDef() / 100;
        }
        hero.setHealth((int) (hero.getHealth() - (physAtt - (physAtt * actualDef))));
    }

    public int getHealth() {
        return health;
    }

    public int getPhysDef() {
        return physDef;
    }

    public int getMagicDef() {
        return magicDef;
    }

    public void setHealth(int health) {
        this.health = Math.max(health, 0);
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void setPhysDef(int physDef) {
        this.physDef = physDef;
    }

    public void setMagicDef(int magicDef) {
        this.magicDef = magicDef;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{ " +
                "Health: " + this.getHealth() + " }";
    }
}
