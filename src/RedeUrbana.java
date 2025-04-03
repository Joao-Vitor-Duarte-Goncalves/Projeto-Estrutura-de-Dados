public class RedeUrbana {
    private ListaCustomizada<Interseccao> interseccoes;  //Lista personalisada
    private ListaCustomizada<Rua> ruas;               // Lista personalisada

    public RedeUrbana() {
        interseccoes = new ListaCustomizada<>();
        ruas = new ListaCustomizada<>();
    }

    // Adiciona uma interseccao a rede
    public void addInterseccao(Interseccao interseccao) {
        interseccoes.add(interseccao);
    }

    // Adiciona uma rua a rede
    public void addRuas(Rua rua){
        ruas.add(rua);
    }

    // Retorna todas as interseccoes


    public ListaCustomizada<Interseccao> getIntersecoes() {
        return interseccoes;
    }

    //Retorna todas as ruas
    public ListaCustomizada<Rua> getRuas() {
        return ruas;
    }
}