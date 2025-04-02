package orgg.src.Vista;

import orgg.src.Constructor.ConstructorNinja;
import orgg.src.modelo.NInja;
import orgg.src.modelo.nijaDao;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class vistaNinja {

    public void mostrarNinja() throws SQLException {

        List<NInja> listsMostrar = nijaDao.mostrarNinjas();

        for (NInja el: listsMostrar){
            System.out.println(el);
        }
    }

    public void mostrarDisponibles() throws SQLException {
        System.out.println("ingrese el id del ninja");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        List<String> listsMostrar = nijaDao.mostarMisionesNinja(id);

        for (String el: listsMostrar){
            System.out.println(el);
        }
    }

    public void mostrarterminadas() throws SQLException {
        System.out.println("ingrese el id del ninja");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        List<String> listsMostrar = nijaDao.mostarMisionesCompletadas(id);

        for (String el: listsMostrar){
            System.out.println(el);
        }
    }

    public void añadirMision(){
        System.out.println("ingrese el id del ninja");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
    }

}
