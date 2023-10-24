package ar.com.proyecto.console;

import ar.com.proyecto.service.EntidadAService;
import ar.com.proyecto.service.EntidadAServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        EntidadAService service = new EntidadAServiceImpl();
        var todos = service.buscarTodos();
        System.out.println(todos);
    }
}
