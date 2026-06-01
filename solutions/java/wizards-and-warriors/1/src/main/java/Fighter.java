abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return String.format("Fighter is a %s",this.getClass().getName());
    }

    @Override
    int damagePoints(Fighter fighter) {
        return fighter.isVulnerable()? 10 : 6;
    }
}

class Wizard extends Fighter {
    boolean spell = false;

    @Override
    boolean isVulnerable() {
        return !this.spell;
    }

    @Override
    int damagePoints(Fighter fighter) {
        return this.spell? 12 : 3;
    }

    void prepareSpell() {
        this.spell = true;
    }

    @Override
    public String toString() {
        return String.format("Fighter is a %s",this.getClass().getName());
    }
}
