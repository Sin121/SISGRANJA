/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hibernate;

import javax.swing.JOptionPane;

/**
 *
 * @author Douglas
 */
public class Alerta {
    String operacao,titulo,msg;

    public Alerta(String operacao, String titulo, String msg) {
        this.operacao = operacao;
        this.titulo = titulo;
        this.msg = msg;
    }

    public void sucesso(){
        JOptionPane.showMessageDialog(null, this.titulo+" "+this.operacao+" com sucesso:\n"+this.msg, this.titulo, JOptionPane.PLAIN_MESSAGE);
    }
    public void erro(){
        JOptionPane.showMessageDialog(null, this.operacao+" não realizada erro: "+this.msg, this.titulo, JOptionPane.ERROR_MESSAGE);
    }
    public void nadaselecionado(){
        JOptionPane.showMessageDialog(null, "Selecione um item da listagem para "+this.msg, this.titulo, JOptionPane.WARNING_MESSAGE);
    }
    public int certeza(){
        return JOptionPane.showConfirmDialog(null, "Tem certeza que deseja "+this.operacao+" o item:\n"+this.msg+"\nEssa operação não poderá ser desfeita.", this.titulo, JOptionPane.YES_NO_OPTION);
    }
    public int embranco(){
        return JOptionPane.showConfirmDialog(null, "Atenção:\n"+this.msg+"Tem certeza que deseja "+this.operacao+" esse item mesmo assim?", this.titulo, JOptionPane.YES_NO_OPTION);
    }
    public void cancelada(){
        JOptionPane.showMessageDialog(null, this.operacao+" cancelada", this.titulo, JOptionPane.ERROR_MESSAGE);
    }

}
