public class Rua {
    private Intersecao comeco;     // Interseção de Origem
    private Intersecao fim;        // Inyterseção de Destino
    private double comprimento;    // Comprimento da Rua
    private int capacidade;        // Capacidade Máxima de Veículos
    private double tempoTravessia; // Tempode travessia

    public Rua(Intersencao comeco, Intersencao fim, double comeprimento, int capacidade, double tempoTravessia){
        this.comeco = comeco;
        this.fim = fim;
        this.comprimento = comprimento;
        this.capacidade = capacidade;
        this.tempoTravessia = tempoTravessia;
    }

    public Intersecao getComeco() {
        return comeco;
    }

    public void setComeco(Intersecao comeco) {
        this.comeco = comeco;
    }

    public Intersecao getFim() {
        return fim;
    }

    public void setFim(Intersecao fim) {
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