public class Semaforo {
    private String estado; // Estado atual, qualquer das três cores
    private int tempoVerde; //tempos dos sinais em segundos
    private int tempoAmarelo;
    private int tempoVermelho;

    //construtor do semaforo
    public Semaforo() {
        this.estado = "VERMELHO"; //inicio padrao
        this.tempoVerde = 30;
        this.tempoAmarelo = 5;
        this.tempoVermelho = 30;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTempoVerde() {
        return tempoVerde;
    }

    public void setTempoVerde(int tempoVerde) {
        this.tempoVerde = tempoVerde;
    }

    public int getTempoAmarelo() {
        return tempoAmarelo;
    }

    public void setTempoAmarelo(int tempoAmarelo) {
        this.tempoAmarelo = tempoAmarelo;
    }

    public int getTempoVermelho() {
        return tempoVermelho;
    }

    public void setTempoVermelho(int tempoVermelho) {
        this.tempoVermelho = tempoVermelho;
    }
}
