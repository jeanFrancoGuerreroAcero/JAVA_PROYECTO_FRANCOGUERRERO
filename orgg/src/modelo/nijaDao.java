package orgg.src.modelo;

import orgg.src.Conexion;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class nijaDao {
    static Conexion conexion = new Conexion();

    public static ArrayList<NInja> mostrarNinjas() throws SQLException {
        String sql = "select n.id,n.nombre,n.Rango,n.aldea, h.nombre from Ninja n inner join habilidad h on n.id = h.id_ninja";

        ArrayList<NInja> listaNinjas = new ArrayList<>();


        try (Connection connect = conexion.con(); PreparedStatement query = connect.prepareStatement(sql)){
            ResultSet nin = query.executeQuery();

            while(nin.next()){
                String nombre = nin.getString("n.nombre");
                String Rango = nin.getString("n.Rango");
                String aldea = nin.getString("n.aldea");
                String habilidad = nin.getString("h.nombre");

                listaNinjas.add(new NInja(nombre,Rango,aldea,habilidad));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return listaNinjas;
    }

    public static ArrayList<String> mostarMisionesNinja(int id) throws SQLException {
        String sql = "select n.nombre, mi.estado, m.descripcion from Ninja n inner join MisionNinja mi on n.id = mi.id_ninja inner join Mision m on mi.id_mision = m.id where mi.estado=0 and n.id=?";

        ArrayList<String> listaMisiones = new ArrayList<>();
        try (Connection connect = conexion.con(); PreparedStatement query =  connect.prepareStatement(sql)){
            query.setInt(1,id);

            ResultSet mi = query.executeQuery();

            while(mi.next()){
                String nombre = mi.getString("m.descripcion");

                listaMisiones.add(nombre);
            }


        }catch (SQLException e){
            e.printStackTrace();
        }
        return listaMisiones;
    }

    public static ArrayList<Mision> mostarMisionesCompletadas(int id) throws SQLException {
        String sql = "select n.nombre,  m.descripcion from Ninja n inner join MisionNinja mi on n.id = mi.id_ninja inner join Mision m on mi.id_mision = m.id where mi.estado=0 and n.id=?";

        ArrayList<Mision> listaMisionesCompletadas = new ArrayList<>();
        try (Connection connect = conexion.con(); PreparedStatement query =  connect.prepareStatement(sql)){
            query.setInt(1,id);

            ResultSet mi = query.executeQuery();

            while(mi.next()){
                String nombre = mi.getString("n.nombre");
                String descripcion = mi.getString("m.descripcion");

                listaMisionesCompletadas.add(new Mision(nombre,descripcion));
            }


        }catch (SQLException e){
            e.printStackTrace();
        }
        return listaMisionesCompletadas;
    }

    public static void newMision(Mision mimpush) throws SQLException {
        String sql = "insert into Mision(id,descripcion,Rango,recompensa) values(?,?,?,?)";

        try (Connection connect = conexion.con(); PreparedStatement query =  connect.prepareStatement(sql)){
            query.setInt(1,mimpush.getId());
            query.setString(2,mimpush.getDescripcion());
            query.setString(3,mimpush.getRando());
            query.setString(4,mimpush.getRecompensa());

            int filas = query.executeUpdate();

            if(filas > 0){
                System.out.println("se agrego la mision");
            }
            else{
                System.out.println("no se agrego la mision");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void finalizarMision(int id) throws SQLException {
        String sql = "update MisionNinja set estado=1 where id=?";

        try (Connection connect = conexion.con(); PreparedStatement query =  connect.prepareStatement(sql)){
            query.setInt(1,id);

            query.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }


    public static ArrayList<MisionNinja> listaCompletadas() throws SQLException {
        String sql = "select m.descripcion, mi.estado, mi.fechaFin from MisionNinja mi inner join Mision m on mi.id_mision = m.id where mi.estado=1";

        ArrayList<MisionNinja> listaTerminadas = new ArrayList<>();

        try (Connection connect = conexion.con(); PreparedStatement query =  connect.prepareStatement(sql)){
            ResultSet ter = query.executeQuery();

            while (ter.next()){
                int estado = ter.getInt("mi.estado");
                String fechaFin = ter.getString("mi.fechaFin");
                String descripcion = ter.getString("m.descripcion");

                listaTerminadas.add(new MisionNinja(estado,fechaFin,descripcion));
            }
        }
        return listaTerminadas;
    }

}
