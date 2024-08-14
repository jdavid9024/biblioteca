
package biblioteca;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jdavi
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String usuario="root";
        String password="darkmaster24";
        String url="jdbc:mysql://localhost:3308/virtualibrary";
        
        Connection cnx;
        Statement st;
        ResultSet rs;
        
        try {
            cnx=DriverManager.getConnection(url,usuario,password);
            st=cnx.createStatement();
            //MOSTRAR O SELECCIONAR DATOS DE LA TABLA ADMINISTRADOR
            
            rs=st.executeQuery("SELECT*FROM administrador");
            rs.next();
            do {
                System.out.println(rs.getInt("id_admin") + ":" + rs.getString("cargo") + ":" + rs.getString("historial_accesoSistema"));
            }while (rs.next());
            
            //INSERTAR DATOS DESDE NETBEANS HACIA BASE DE DATOS
            
            /*st.executeUpdate("INSERT INTO administrador VALUES(2,'COORDINADOR',null)");
            rs=st.executeQuery("SELECT*FROM administrador");
            rs.next();
            do {
                System.out.println(rs.getInt("id_admin") + ":" + rs.getString("cargo") + ":" + rs.getString("historial_accesoSistema"));
            }while (rs.next()); */
            
            //ACTUALIZAR DATOS DESDE LA BASE DE DATOS
            //UPDATE administrador SET cargo= "psicologo" WHERE id_admin= '2'
            
            /*st.executeUpdate("UPDATE administrador SET cargo= 'PSICOLOGO' WHERE id_admin= '2'");
            rs=st.executeQuery("SELECT*FROM administrador");
            rs.next();
            do {
                System.out.println(rs.getInt("id_admin") + ":" + rs.getString("cargo") + ":" + rs.getString("historial_accesoSistema"));
            }while (rs.next());
            */
            
            
            //ELIMINAR DATOS DE LA BASE DE DATOS
            //DELETE from administrador WHERE id_admin=1;
            
            st.execute("DELETE from administrador WHERE id_admin=1");
            rs=st.executeQuery("SELECT*FROM administrador");
            rs.next();
            do {
                System.out.println(rs.getInt("id_admin") + ":" + rs.getString("cargo") + ":" + rs.getString("historial_accesoSistema"));
            }while (rs.next());
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
