package orgg.src.mvc;

import orgg.src.Constructor.ConstructorNinja;
import orgg.src.Vista.vistaNinja;
import orgg.src.modelo.nijaDao;

import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello, World!");

        nijaDao daoNinja = new nijaDao();
        vistaNinja vist = new vistaNinja();
        ConstructorNinja contruNinja = new ConstructorNinja(daoNinja,vist);


        contruNinja.iniciar();
    }
}
