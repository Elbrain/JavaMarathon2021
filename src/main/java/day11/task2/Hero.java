package day11.task2;

public abstract class Hero {
    private int health;
    private int physDef; //процент поглощения физического урона
    private int magicDef; //процент поглощения магического урона

    public Hero() {
        this.health = 100;
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
