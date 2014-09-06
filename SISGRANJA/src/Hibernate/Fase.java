package Hibernate;
// Generated 02/09/2014 13:48:05 by Hibernate Tools 3.6.0

import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;




/**
 * Fase generated by hbm2java
 */
public class Fase  implements java.io.Serializable {


     private Integer codigo;
     private String nome;
     private String descricao;
     private int tipo;
     private int inicio;
     private int duracao;

    public Fase() {
    }

    public Fase(String nome, String descricao, int tipo, int inicio, int duracao) {
       this.nome = nome;
       this.descricao = descricao;
       this.tipo = tipo;
       this.inicio = inicio;
       this.duracao = duracao;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getTipo() {
        return this.tipo;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public int getInicio() {
        return this.inicio;
    }
    
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
    public int getDuracao() {
        return this.duracao;
    }
    
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public void cadastrar(){
        boolean embranco = false;
        Alerta msg;
        //ver se tem campos em branco
        if (this.descricao.length() == 0){
            embranco = true;
        }
        if (this.nome.length() == 0){
            embranco = true;
        }
        //ver se quer cadastrar mesmo com campos em branco
        if (embranco == true){
            msg = new Alerta("cadastrar","Campos em branco",this.toString());
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
                msg = new Alerta("cadastrada","Fase",this.toString());
                msg.sucesso();
            } catch (Exception erro) {
                msg = new Alerta("cadastro","Fase",erro.getMessage());
                msg.erro();
                //erro.printStackTrace();
            }
        }
    }
    public void excluir(){
        Alerta msg = new Alerta("excluir","Exclusão de Fase",this.toString());
        int certeza = msg.certeza();//sim = 0, nao = 1, estranho...
        if (certeza==0){
            try {
                Session session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                session.delete(this);
                session.getTransaction().commit();
                //HibernateUtil.shutdown();
                msg = new Alerta("excluida","Fase",this.toString());
                msg.sucesso();
            } catch (Exception erro) {
                msg = new Alerta("exclusão","Fase",erro.getMessage());
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
        Alerta msg;
        //ver se tem campos em branco
        if (this.descricao.length() == 0){
            embranco = true;
        }
        if (this.nome.length() == 0){
            embranco = true;
        }
        //ver se quer editar mesmo com campos em branco
        if (embranco){
            msg = new Alerta("editar","Campos em branco",this.toString());
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
                msg = new Alerta("editada","Fase",this.toString());
                msg.sucesso();
            } catch (Exception erro) {
                msg = new Alerta("edição","Fase",erro.getMessage());
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
        Query select = session.createQuery("from Fase");  
        List lista = select.list();  
        session.getTransaction().commit();
        DefaultTableModel model = new DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Código", "Tipo", "Nome", "Descrição", "Inicio", "Fim", "Duração"
            }
        ){
            @Override
            public boolean isCellEditable(int row, int column) {//não deixar editar as celulas
                return false;
            }
        };
        model.setRowCount(0);
        for(Iterator it = lista.iterator();it.hasNext();){
            Fase fase = (Fase) it.next();
            model.addRow(
                new Object[]{
                    fase.getCodigo(),
                    fase.getTipo(),
                    fase.getNome(),
                    fase.getDescricao(),
                    fase.getInicio(),
                    (fase.getInicio() + fase.getDuracao() - 1),//fim = inicio + duracao - 1
                    fase.getDuracao()
                }
            );
        }
        jTable1.setAutoCreateRowSorter(true);//auto-ordenar
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);//selecionar so 1 entrada
        return model;
    }


    @Override
    public String toString() {
        return codigo + ", " + tipo + ", " + nome + ", " + descricao + ", " + inicio + ", " + duracao;
    }
}

