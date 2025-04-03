public class Veiculo {
    private int id;                  // Identificador Único do  veículo
    private Interseccao origem;      // Origem do Veículo
    private Interseccao destino;     // Destino do Veículo
    private double tempoTotalViagem; // Tempo total de viagem

    public Veiculo(int id, Interseccao origem, Interseccao destino) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.tempoTotalViagem = 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Interseccao getOrigem() {
        return origem;
    }

    public void setOrigem(Interseccao origem) {
        this.origem = origem;
    }

    public Interseccao getDestino() {
        return destino;
    }

    public void setDestino(Interseccao destino) {
        this.destino = destino;
    }

    public double getTempoTotalViagem() {
        return tempoTotalViagem;
    }

    public void setTempoTotalViagem(double tempoTotalViagem) {
        this.tempoTotalViagem = tempoTotalViagem;
    }
}
