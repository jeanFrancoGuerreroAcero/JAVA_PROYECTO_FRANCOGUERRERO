package orgg.src.Vista;

import orgg.src.modelo.Mision;
import orgg.src.modelo.MisionNinja;
import orgg.src.modelo.NInja;
import orgg.src.modelo.nijaDao;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import static orgg.src.modelo.nijaDao.newMision;

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
            System.out.println("La mision que esta disponible para este ninja: " + el);
        }
    }

    public void mostrarterminadas() throws SQLException {
        System.out.println("ingrese el id del ninja");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        List<Mision> listsMostrar = nijaDao.mostarMisionesCompletadas(id);

        for (Mision el: listsMostrar){
            System.out.println(el);
        }
    }

    public void añadirMision() throws SQLException {
        System.out.println("ingrese el id del ninja");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la fecha de inicio de la mision: ");
        String descripcion = sc.nextLine();
        System.out.println("Ingrese fecha de fin de la mision");
        int estado = 0;
        System.out.println("Ingrese el id del ninja");
        int id_ninja = sc.nextInt();
        System.out.println("Ingrese el id de la mision");
        int id_mision = sc.nextInt();

        MisionNinja mision = new MisionNinja(id,descripcion,estado,id_ninja,id_mision);

        nijaDao.newMision(mision);
    }

    public MisionNinja finalizarMision() throws SQLException {
        System.out.println("ingrese el id de la mision que deseas finalizar");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        MisionNinja mision = new MisionNinja(id);

        nijaDao.finalizarMision(id);

        return mision;
    }

    public void mostrarTerminadasFinal() throws SQLException {
        List<MisionNinja> lisTerminadas = nijaDao.listaCompletadas();

        for(MisionNinja mi: lisTerminadas){
            System.out.println(mi);
        }
    }
}
