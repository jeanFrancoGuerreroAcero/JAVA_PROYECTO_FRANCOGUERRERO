package orgg.src.Constructor;

import orgg.src.modelo.nijaDao;
import orgg.src.Vista.vistaNinja;

import java.sql.SQLException;
import java.util.Scanner;

public class ConstructorNinja {

    private nijaDao daoNinja;
    private vistaNinja vistaNinja;

    public ConstructorNinja(nijaDao daoNinja,vistaNinja vistaNinja) {
        this.daoNinja = daoNinja;
        this.vistaNinja = vistaNinja;
    }

    public void iniciar() throws SQLException {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("----------------------");
            System.out.println("GESTION MISIONES NINJA");
            System.out.println("----------------------");

            System.out.println("1. Ver todos los ninjas con sus habilidades");
            System.out.println("2. ver las misiones disponibles por un ninja en especifico");
            System.out.println("3. Ver las misiones completadas por un ninja en especifico");
            System.out.println("4. Asignar una mision a un ninja");
            System.out.println("6. Mostrar las misiones terminadas por los ninjas");

            int opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    vistaNinja.mostrarNinja();
                    break;
                case 2:
                    vistaNinja.mostrarDisponibles();
                    break;
                case 3:
                    vistaNinja.mostrarterminadas();
                    break;
                case 6:
                    vistaNinja.mostrarTerminadasFinal();
                    break;
            }
        }
    }
}
