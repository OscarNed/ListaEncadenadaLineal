package listasencadenadas;

/**
 *
 * @author OscarNedzelsky   A00513376
 */
public class ListaEncadenadaLineal <T> {
    //Atributos
    Nodo inicio;
    Nodo fin;
    
    public void InsertarInicio (T n) {
        Nodo nodo = new Nodo(n);
        if (isEmpty()) {
            inicio = nodo;
            fin = nodo;
        } else {
            nodo.next = inicio;
            inicio = nodo;
        }
    }
    
    public void InsertarFin (T n) {
        Nodo nodo = new Nodo(n);
        if (isEmpty()) {
            inicio = nodo;
            fin = nodo;
        } else {
            fin.next = nodo;
            fin = nodo;
        }
    }
    
    public void BorrarInicio() {
        if (isEmpty()) {
            System.out.println("La lista está vacía.");
        }
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            Nodo aux = inicio;
            inicio = aux.next;
        }
    }
    
    public void BorrarFinal() {
        if (isEmpty()) {
            System.out.println("La lista está vacía.");
        }
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            Nodo aux = inicio;
            while (aux.next != fin) {
                aux = aux.next;
            }
            aux.next = null;
            fin = aux;
        }
    }
    
    private boolean isEmpty() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void MuestraLista() {
        if (isEmpty() == false) {
            Nodo aux = inicio;
            while(aux != null) {
                System.out.print("[" + aux.data + "] ");
                aux = aux.next;
            }
        }
        System.out.print("☠\n");
    }
}
