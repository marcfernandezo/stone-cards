public class Entity {
    private String nombre;
    private int nivel;
    private int puntosVida;

    public Entity(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    public String getName() {
        return this.nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public int getLevel() {
        return this.nivel;
    }

    public void setLevel(int nivel) {
        this.nivel = nivel;
    }

    public int getHeartPoints() {
        return this.puntosVida;
    }

    public void setHeartPoints(int puntosVida) {
        this.puntosVida = puntosVida;
    }
}
