public class CharacterWizard extends Entity {
    private int fuerzaAtaque;
    private boolean fuerzaFisica;
    private int fuerzaFisicaPuntos;
    private int mana;

    public CharacterWizard(int fuerzaAtaque, boolean fuerzaFisica, int fuerzaFisicaPuntos, int mana) {
        this.fuerzaAtaque = fuerzaAtaque;
        this.fuerzaFisica = fuerzaFisica;
        this.fuerzaFisicaPuntos = fuerzaFisicaPuntos;
        this.mana = mana;
    }

    public int getFuerzaAtaque() {
        return fuerzaAtaque;
    }

    public void setFuerzaAtaque(int fuerzaAtaque) {
        this.fuerzaAtaque = fuerzaAtaque;
    }

    public boolean isFuerzaFisica() {
        return fuerzaFisica;
    }

    public void setFuerzaFisica(boolean fuerzaFisica) {
        this.fuerzaFisica = fuerzaFisica;
    }

    public int getFuerzaFisicaPuntos() {
        return fuerzaFisicaPuntos;
    }

    public void setFuerzaFisicaPuntos(int fuerzaFisicaPuntos) {
        this.fuerzaFisicaPuntos = fuerzaFisicaPuntos;
    }

    public int getMana() {
        return mana;
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
