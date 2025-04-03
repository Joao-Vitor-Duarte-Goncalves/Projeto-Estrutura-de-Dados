public class Rua {
    private Interseccao comeco;     // Interseção de Origem
    private Interseccao fim;        // Inyterseção de Destino
    private double comprimento;    // Comprimento da Rua
    private int capacidade;        // Capacidade Máxima de Veículos
    private double tempoTravessia; // Tempode travessia

    public Rua(Interseccao comeco, Interseccao fim, double comprimento, int capacidade, double tempoTravessia){
        this.comeco = comeco;
        this.fim = fim;
        this.comprimento = comprimento;
        this.capacidade = capacidade;
        this.tempoTravessia = tempoTravessia;
    }

    public Interseccao getComeco() {
        return comeco;
    }

    public void setComeco(Interseccao comeco) {
        this.comeco = comeco;
    }

    public Interseccao getFim() {
        return fim;
    }

    public void setFim(Interseccao fim) {
        this.fim = fim;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getTempoTravessia() {
        return tempoTravessia;
    }

    public void setTempoTravessia(double tempoTravessia) {
        this.tempoTravessia = tempoTravessia;
    }
}