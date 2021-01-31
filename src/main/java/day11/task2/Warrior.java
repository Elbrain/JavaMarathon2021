package day11.task2;

public class Warrior extends Hero implements PhysAttack {


    public Warrior() {
        super.setPhysDef(80);
        super.setMagicDef(0);
        super.setPhysAtt(30);
    }
}
