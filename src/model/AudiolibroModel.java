
package model;


public class AudiolibroModel {
    private int id_al;
    private String duracion;
    private String genero;
    private String calidadAudio;
    
    public AudiolibroModel() {
    this.id_al = 0;
    this.duracion = "";
    this.genero = "";
    this.calidadAudio = "";
    }

    public AudiolibroModel(int id_al, String duracion, String genero, String calidadAudio) {
        this.id_al = id_al;
        this.duracion = duracion;
        this.genero = genero;
        this.calidadAudio = calidadAudio;
    }

    public int getId_al() {
        return id_al;
    }

    public void setId_al(int id_al) {
        this.id_al = id_al;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCalidadAudio() {
        return calidadAudio;
    }

    public void setCalidadAudio(String calidadAudio) {
        this.calidadAudio = calidadAudio;
    }
   
    
    
}
