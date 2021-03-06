package Hibernate;
// Generated 06/09/2014 17:29:32 by Hibernate Tools 3.6.0



/**
 * MensagemdiaId generated by hbm2java
 */
public class MensagemdiaId  implements java.io.Serializable {


     private int codigoDia;
     private int codigoMensagem;

    public MensagemdiaId() {
    }

    public MensagemdiaId(int codigoDia, int codigoMensagem) {
       this.codigoDia = codigoDia;
       this.codigoMensagem = codigoMensagem;
    }
   
    public int getCodigoDia() {
        return this.codigoDia;
    }
    
    public void setCodigoDia(int codigoDia) {
        this.codigoDia = codigoDia;
    }
    public int getCodigoMensagem() {
        return this.codigoMensagem;
    }
    
    public void setCodigoMensagem(int codigoMensagem) {
        this.codigoMensagem = codigoMensagem;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MensagemdiaId) ) return false;
		 MensagemdiaId castOther = ( MensagemdiaId ) other; 
         
		 return (this.getCodigoDia()==castOther.getCodigoDia())
 && (this.getCodigoMensagem()==castOther.getCodigoMensagem());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCodigoDia();
         result = 37 * result + this.getCodigoMensagem();
         return result;
   }   


}


