package Hibernate;
// Generated 06/09/2014 17:29:32 by Hibernate Tools 3.6.0



/**
 * Pesagem generated by hbm2java
 */
public class Pesagem  implements java.io.Serializable {


     private Integer codigo;
     private String observacao;
     private int codTipoPeso;

    public Pesagem() {
    }

    public Pesagem(String observacao, int codTipoPeso) {
       this.observacao = observacao;
       this.codTipoPeso = codTipoPeso;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getObservacao() {
        return this.observacao;
    }
    
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public int getCodTipoPeso() {
        return this.codTipoPeso;
    }
    
    public void setCodTipoPeso(int codTipoPeso) {
        this.codTipoPeso = codTipoPeso;
    }




}


