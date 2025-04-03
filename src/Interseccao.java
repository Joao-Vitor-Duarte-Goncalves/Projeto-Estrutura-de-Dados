public class Interseccao {
    private int id; // identificador da intersecção
    private Semaforo semaforo; //semaforo nas interc

    public Interseccao(int id) {
        this.id = id;
        this.semaforo = new Semaforo(); // Inicializa um semaforo padrao
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Semaforo getSemaforo() {
        return semaforo;
    }

    public void setSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }
}
