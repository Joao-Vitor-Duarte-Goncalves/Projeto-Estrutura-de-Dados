public class ListaCustomizada<T> {
    private No<T> head;

    public void add(T valor) {
        No<T> novoNo = new No<>(valor);
        if (head == null) {
            head = novoNo;
        } else {
            No<T> atual = head;
            while (atual.getProx() != null) {
                atual = atual.getProx();
            }
            atual.setProx(novoNo);
        }
    }
    public T get(int indice) {
        No<T> atual = head;
        for (int i = 0; i < indice && atual != null; i++) {
            atual = atual.getProx();
        }
        return (atual != null) ? atual.getValor() : null;
    }
}
