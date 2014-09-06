package Hibernate;
// Generated 06/09/2014 17:29:32 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Lotemedicamento generated by hbm2java
 */
public class Lotemedicamento  implements java.io.Serializable {


     private Integer codigo;
     private int codTipoMedicamento;
     private String fabricante;
     private Date validade;
     private int quantidade;
     private float preco;
     private float valorTotal;

    public Lotemedicamento() {
    }

    public Lotemedicamento(int codTipoMedicamento, String fabricante, Date validade, int quantidade, float preco, float valorTotal) {
       this.codTipoMedicamento = codTipoMedicamento;
       this.fabricante = fabricante;
       this.validade = validade;
       this.quantidade = quantidade;
       this.preco = preco;
       this.valorTotal = valorTotal;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public int getCodTipoMedicamento() {
        return this.codTipoMedicamento;
    }
    
    public void setCodTipoMedicamento(int codTipoMedicamento) {
        this.codTipoMedicamento = codTipoMedicamento;
    }
    public String getFabricante() {
        return this.fabricante;
    }
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public Date getValidade() {
        return this.validade;
    }
    
    public void setValidade(Date validade) {
        this.validade = validade;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public float getPreco() {
        return this.preco;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public float getValorTotal() {
        return this.valorTotal;
    }
    
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }




}

