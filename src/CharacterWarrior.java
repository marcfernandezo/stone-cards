public class CharacterWarrior extends Entity {
    private int fuerzaAtaque;
    private boolean fuerzaFisica;
    private int mana;

    public CharacterWarrior(int fuerzaAtaque, boolean fuerzaFisica, int mana) {
        this.fuerzaAtaque = fuerzaAtaque;
        this.fuerzaFisica = fuerzaFisica;
        this.mana = mana;
    }

    public boolean isFuerzaFisica() {
        return fuerzaFisica;
    }

    public void setFuerzaFisica(boolean fuerzaFisica) {
        this.fuerzaFisica = fuerzaFisica;
    }

    public int getFuerzaAtaque() {
        return this.fuerzaAtaque;
    }

    public void setFuerzaAtaque(int fuerzaAtaque) {
        this.fuerzaAtaque = fuerzaAtaque;
    }

    public int getMana() {
        return this.mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void atacar(Entity objetivo) {
        objetivo.setHeartPoints(
                objetivo.getHeartPoints() - this.fuerzaAtaque
        );

        setMana(-5);
    }
}
