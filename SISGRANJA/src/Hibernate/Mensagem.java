package Hibernate;
// Generated 06/09/2014 17:29:32 by Hibernate Tools 3.6.0



/**
 * Mensagem generated by hbm2java
 */
public class Mensagem  implements java.io.Serializable {


     private Integer codigo;
     private String texto;
     private String tipo;

    public Mensagem() {
    }

    public Mensagem(String texto, String tipo) {
       this.texto = texto;
       this.tipo = tipo;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getTexto() {
        return this.texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }




}


