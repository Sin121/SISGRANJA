package Hibernate;
// Generated 06/09/2014 17:29:32 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Dia generated by hbm2java
 */
public class Dia  implements java.io.Serializable {


     private Integer codigo;
     private Date data;
     private String observacao;
     private boolean status;
     private int codLote;
     private int codGalpao;
     private int codHorasLuz;
     private int codFase;

    public Dia() {
    }

    public Dia(Date data, String observacao, boolean status, int codLote, int codGalpao, int codHorasLuz, int codFase) {
       this.data = data;
       this.observacao = observacao;
       this.status = status;
       this.codLote = codLote;
       this.codGalpao = codGalpao;
       this.codHorasLuz = codHorasLuz;
       this.codFase = codFase;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public String getObservacao() {
        return this.observacao;
    }
    
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public boolean isStatus() {
        return this.status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    public int getCodLote() {
        return this.codLote;
    }
    
    public void setCodLote(int codLote) {
        this.codLote = codLote;
    }
    public int getCodGalpao() {
        return this.codGalpao;
    }
    
    public void setCodGalpao(int codGalpao) {
        this.codGalpao = codGalpao;
    }
    public int getCodHorasLuz() {
        return this.codHorasLuz;
    }
    
    public void setCodHorasLuz(int codHorasLuz) {
        this.codHorasLuz = codHorasLuz;
    }
    public int getCodFase() {
        return this.codFase;
    }
    
    public void setCodFase(int codFase) {
        this.codFase = codFase;
    }




}


