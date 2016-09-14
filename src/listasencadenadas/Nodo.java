package listasencadenadas;

/**
 *
 * @author OscarNedzelsky   A00513376
 */
public class Nodo <T> {
    //Atributos
    T data;
    Nodo next;
    
    //Constructor
    public Nodo(T data) {
        this.data = data;
        this.next = null;
}
}
