package Hibernate;
// Generated 06/09/2014 17:29:32 by Hibernate Tools 3.6.0



/**
 * Lotecama generated by hbm2java
 */
public class Lotecama  implements java.io.Serializable {


     private Integer codigo;
     private int codTipoCama;
     private String origem;
     private float preco;
     private float quantidade;
     private float valorTotal;

    public Lotecama() {
    }

    public Lotecama(int codTipoCama, String origem, float preco, float quantidade, float valorTotal) {
       this.codTipoCama = codTipoCama;
       this.origem = origem;
       this.preco = preco;
       this.quantidade = quantidade;
       this.valorTotal = valorTotal;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public int getCodTipoCama() {
        return this.codTipoCama;
    }
    
    public void setCodTipoCama(int codTipoCama) {
        this.codTipoCama = codTipoCama;
    }
    public String getOrigem() {
        return this.origem;
    }
    
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public float getPreco() {
        return this.preco;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public float getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }
    public float getValorTotal() {
        return this.valorTotal;
    }
    
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }




}

