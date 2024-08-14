
package model;


public class AdministradorModel {
    private int id_admin;
    private String cargo;
    private String historial_accesoSistema;
    
    public AdministradorModel(){
    this.id_admin=0;
    this.cargo="";
    this.historial_accesoSistema="";
    }

    public AdministradorModel(int id_admin, String cargo, String historial_accesoSistema) {
        this.id_admin = id_admin;
        this.cargo = cargo;
        this.historial_accesoSistema = historial_accesoSistema;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHistorial_accesoSistema() {
        return historial_accesoSistema;
    }

    public void setHistorial_accesoSistema(String historial_accesoSistema) {
        this.historial_accesoSistema = historial_accesoSistema;
    }
    
    
    
}
