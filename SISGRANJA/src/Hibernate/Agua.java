package Hibernate;
// Generated 06/09/2014 17:29:32 by Hibernate Tools 3.6.0



/**
 * Agua generated by hbm2java
 */
public class Agua  implements java.io.Serializable {


     private Integer codigo;
     private float preco;
     private float quantidade;

    public Agua() {
    }

    public Agua(float preco, float quantidade) {
       this.preco = preco;
       this.quantidade = quantidade;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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




}


