package Hibernate;
// Generated 05/09/2014 15:29:24 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Tipoeqeletrico generated by hbm2java
 */
public class Tipoeqeletrico  implements java.io.Serializable {


     private Integer codigo;
     private String tipo;
     private String nome;
     private int potencia;
     private Set loteeqeletricos = new HashSet(0);

    public Tipoeqeletrico() {
    }

	
    public Tipoeqeletrico(String tipo, String nome, int potencia) {
        this.tipo = tipo;
        this.nome = nome;
        this.potencia = potencia;
    }
    public Tipoeqeletrico(String tipo, String nome, int potencia, Set loteeqeletricos) {
       this.tipo = tipo;
       this.nome = nome;
       this.potencia = potencia;
       this.loteeqeletricos = loteeqeletricos;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPotencia() {
        return this.potencia;
    }
    
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public Set getLoteeqeletricos() {
        return this.loteeqeletricos;
    }
    
    public void setLoteeqeletricos(Set loteeqeletricos) {
        this.loteeqeletricos = loteeqeletricos;
    }
    public void cadastrar(){
        boolean embranco = false;
        String vazios="";
        Alerta msg;
        //ver se tem campos em branco
        if (this.nome.length() == 0){
            embranco = true;
            vazios+="O campo Nome não foi preenchido.\n";
        }
        if (this.tipo.length() == 0){
            embranco = true;
            vazios+="O campo Tipo não foi preenchido.\n";
        }
        //ver se quer cadastrar mesmo com campos em branco
        if (embranco == true){
            msg = new Alerta("editar","Campos em branco",vazios);
            int certeza = msg.embranco();//sim = 0, nao = 1, estranho...
            if (certeza==0){
                embranco = false;
            }else{
                msg = new Alerta("Cadastro","Operação cancelada",null);
                msg.cancelada();
                embranco = true;
            }
        }
        //cadastro
        if (!embranco){
            try {
                Session session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                session.save(this);
                session.getTransaction().commit();
                //HibernateUtil.shutdown();
                msg = new Alerta("cadastrada","Tipo de Equipamento Elétrico",this.toString());
                msg.sucesso();
                session.close();
            } catch (Exception erro) {
                msg = new Alerta("cadastro","Tipo de Equipamento Elétrico",erro.getMessage());
                msg.erro();
                //erro.printStackTrace();
            }
        }
    }
    public void excluir(){
        Alerta msg = new Alerta("excluir","Exclusão de Tipo de Equipamento Elétrico",this.toString());
        int certeza = msg.certeza();//sim = 0, nao = 1, estranho...
        if (certeza==0){
            try {
                Session session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                session.delete(this);
                session.getTransaction().commit();
                //HibernateUtil.shutdown();
                msg = new Alerta("excluida","Tipo de Equipamento Elétrico",this.toString());
                msg.sucesso();
                session.close();
            } catch (Exception erro) {
                msg = new Alerta("exclusão","Tipo de Equipamento Elétrico",erro.getMessage());
                msg.erro();
                //erro.getMessage();
            }
        }else{
            msg = new Alerta("Exclusão","Operação cancelada",null);
            msg.cancelada();
        }
    }
    public void editar(){
        boolean embranco = false;
        String vazios="";
        Alerta msg;
        //ver se tem campos em branco
        if (this.nome.length() == 0){
            embranco = true;
            vazios+="O campo Nome não foi preenchido.\n";
        }
        if (this.tipo.length() == 0){
            embranco = true;
            vazios+="O campo Tipo não foi preenchido.\n";
        }
        //ver se quer editar mesmo com campos em branco
        if (embranco){
            msg = new Alerta("editar","Campos em branco",vazios);
            int certeza = msg.embranco();//sim = 0, nao = 1, estranho...
            if (certeza==0){
                embranco = false;
            }else{
                msg = new Alerta("Edição","Operação cancelada",null);
                msg.cancelada();
                embranco = true;
            }
        }
        //cadastro
        if (!embranco){
            try {
                Session session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                session.update(this);
                session.getTransaction().commit();
                //HibernateUtil.shutdown();
                msg = new Alerta("editada","Tipo de Equipamento Elétrico",this.toString());
                msg.sucesso();
                session.close();
            } catch (Exception erro) {
                msg = new Alerta("edição","Tipo de Equipamento Elétrico",erro.getMessage());
                msg.erro();
                //erro.getMessage();
            }
        }else{
            msg = new Alerta("Edição","Operação cancelada",null);
            msg.cancelada();
        }
    }
    public DefaultTableModel modelotabela(javax.swing.JTable jTable1){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query select = session.createQuery("from Tipoeqeletrico");  
        List lista = select.list();  
        session.getTransaction().commit();
        session.close();
        DefaultTableModel model = new DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Código", "Nome", "Tipo", "Potência"
            }
        ){
            @Override
            public boolean isCellEditable(int row, int column) {//não deixar editar as celulas
                return false;
            }
        };
        model.setRowCount(0);
        for(Iterator it = lista.iterator();it.hasNext();){
            Tipoeqeletrico tipoeqeletrico = (Tipoeqeletrico) it.next();
            model.addRow(
                new Object[]{
                    tipoeqeletrico.getCodigo(),
                    tipoeqeletrico.getNome(),
                    tipoeqeletrico.getTipo(),
                    tipoeqeletrico.getPotencia()
                }
            );
        }
        jTable1.setAutoCreateRowSorter(true);//auto-ordenar
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);//selecionar so 1 entrada
        return model;
    }
    public DefaultComboBoxModel modelocombobox(){
        Alerta msg;
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query select = session.createQuery("from Tipoeqeletrico");  
            List lista = select.list();  
            session.getTransaction().commit();
            session.close();
            for (Iterator it = lista.iterator(); it.hasNext();) {
                Object obj = it.next();
                model.addElement(obj);
            }
        }catch (Exception erro) {
                msg = new Alerta("Consulta","Tipo de Equipamento Elétrico",erro.getMessage());
                msg.erro();
                //erro.getMessage();
            }
        return model;  
    }
    public int indexdacombobox(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query select = session.createQuery("from Tipoeqeletrico");
        List lista = select.list();
        select = session.createQuery("from Tipoeqeletrico where codigo='"+this.codigo+"'");
        Tipoeqeletrico auxiliar = (Tipoeqeletrico) select.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return lista.indexOf(auxiliar);
        
//        int aux=0, x=0;
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        Query select = session.createQuery("from Tipoeqeletrico");
//        List lista = select.list();
//        session.getTransaction().commit();
//        session.close();
//        for(Iterator it = lista.iterator();it.hasNext();){
//            Tipoeqeletrico tipoeqeletrico = (Tipoeqeletrico) it.next();
//            if (tipoeqeletrico.getCodigo()==this.codigo){
//                x=aux;
//            }else{
//                aux=aux+1;
//            }
//        }
//        return x;
        
    }
    @Override
    public String toString() {
        return codigo + ", " + nome + ", " + tipo + ", " + potencia;
    }



}


