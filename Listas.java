package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Listas {
    public static void main(String[] args) {
        List <String> miLista = new ArrayList <>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        for( String elemnto: miLista){
            System.out.println("Dia de la semana: "+ elemnto);
        }

        //Funciones lambda (funcion anoniman de un codigo muy compacto)
        miLista.forEach(elemento ->{
            System.out.println("Elemento: "+ elemento);
        });

    }
}
