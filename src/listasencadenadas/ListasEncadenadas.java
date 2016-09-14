package listasencadenadas;

/**
 *
 * @author OscarNedzelsky A00513376
 */
public class ListasEncadenadas {

    public static void main(String[] args) {
        ListaEncadenadaLineal numeros = new ListaEncadenadaLineal();
        numeros.InsertarInicio(1);
        numeros.InsertarInicio(10);
        numeros.InsertarFin(12);
        numeros.InsertarFin(26);
        numeros.MuestraLista();
        numeros.BorrarInicio();
        numeros.BorrarFinal();
        numeros.MuestraLista();
        
        ListaEncadenadaLineal nombres = new ListaEncadenadaLineal();
        nombres.InsertarInicio("Oscar");
        nombres.InsertarInicio("Luisa");
        nombres.InsertarFin("Ernesto");
        nombres.InsertarFin("Daniel");
        nombres.MuestraLista();
        nombres.BorrarInicio();
        nombres.BorrarFinal();
        nombres.MuestraLista();
    }
    
}
