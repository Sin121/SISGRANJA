/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Janelas;

import Janelas.Coleta_Ovos.Coleta_Ovos;
import Janelas.Enciclopedia.Cadastro_Item_Enciclopedia;
import Janelas.Enciclopedia.Item_Enciclopedia;
import Janelas.Fase.Cadastro_Fase;
import Janelas.Fase.Fase;
import Janelas.Galpao.Cadastro_Galpao;
import Janelas.Galpao.Galpao;
import Janelas.Gasto.Cama.Cadastro_Lote_Cama;
import Janelas.Gasto.Cama.Cadastro_Tipo_Cama;
import Janelas.Gasto.Cama.Lote_Cama;
import Janelas.Gasto.Cama.Tipo_Cama;
import Janelas.Gasto.Equipamento_Eletrico.Cadastro_Lote_Equipamento_Eletrico;
import Janelas.Gasto.Equipamento_Eletrico.Cadastro_Tipo_Equipamento_Eletrico;
import Janelas.Gasto.Equipamento_Eletrico.Lote_Equipamento_Eletrico;
import Janelas.Gasto.Equipamento_Eletrico.Tipo_Equipamento_Eletrico;
import Janelas.Gasto.Gas.Cadastro_Lote_Gas;
import Janelas.Gasto.Gas.Cadastro_Tipo_Gas;
import Janelas.Gasto.Gas.Lote_Gas;
import Janelas.Gasto.Gas.Tipo_Gas;
import Janelas.Gasto.Gasto;
import Janelas.Gasto.Medicamento.Cadastro_Lote_Medicamento;
import Janelas.Gasto.Medicamento.Cadastro_Tipo_Medicamento;
import Janelas.Gasto.Medicamento.Lote_Medicamento;
import Janelas.Gasto.Medicamento.Tipo_Medicamento;
import Janelas.Gasto.Racao.Cadastro_Lote_Racao;
import Janelas.Gasto.Racao.Cadastro_Tipo_Racao;
import Janelas.Gasto.Racao.Lote_Racao;
import Janelas.Gasto.Racao.Tipo_Racao;
import Janelas.Gasto.Vacina.Cadastro_Lote_Vacina;
import Janelas.Gasto.Vacina.Cadastro_Tipo_Vacina;
import Janelas.Gasto.Vacina.Lote_Vacina;
import Janelas.Gasto.Vacina.Tipo_Vacina;
import Janelas.Horas_Luz_Dia.Cadastro_Horas_Luz_Dia;
import Janelas.Horas_Luz_Dia.Horas_Luz_Dia;
import Janelas.Linhagem.Cadastro_Linhagem;
import Janelas.Linhagem.Linhagem;
import Janelas.Lote.Cadastro_Lote_Corte;
import Janelas.Lote.Cadastro_Lote_Postura;
import Janelas.Lote.Gerencia_Lote_Corte;
import Janelas.Lote.Gerencia_Lote_Postura;
import Janelas.Lote.Lote_Corte;
import Janelas.Lote.Lote_Postura;
import Janelas.Lote.Seleciona_Lote;
import Janelas.Mensagem.Cadastro_Mensagem;
import Janelas.Mensagem.Mensagem;
import Janelas.Mortalidade.Cadastro_Tipo_Mortalidade;
import Janelas.Mortalidade.Mortalidade;
import Janelas.Mortalidade.Tipo_Mortalidade;
import Janelas.Peso.Pesagem;
import Janelas.Valor_Medio.Cadastro_Valor_Medio;
import Janelas.Valor_Medio.Valor_Medio;
import Janelas.Venda.Venda;

/**
 *
 * @author Douglas
 */
public class Principal extends javax.swing.JFrame {
    private Coleta_Ovos coleta_ovos;
    private Item_Enciclopedia item_enciclopedia;
    private Fase fase;
    private Galpao galpao;
    private Gasto gasto;
    private Lote_Cama lote_cama;
    private Tipo_Cama tipo_cama;
    private Lote_Equipamento_Eletrico lote_equipamento_eletrico;
    private Tipo_Equipamento_Eletrico tipo_equipamento_eletrico;
    private Lote_Gas lote_gas;
    private Tipo_Gas tipo_gas;
    private Lote_Medicamento lote_medicamento;
    private Tipo_Medicamento tipo_medicamento;
    private Lote_Racao lote_racao;
    private Tipo_Racao tipo_racao;
    private Lote_Vacina lote_vacina;
    private Tipo_Vacina tipo_vacina;
    private Horas_Luz_Dia horas_luz_dia;
    private Linhagem linhagem;
    private Lote_Corte lote_corte;
    private Lote_Postura lote_postura;
    private Mensagem mensagem;
    private Mortalidade mortalidade;
    private Tipo_Mortalidade tipo_mortalidade;
    private Pesagem pesagem;
    private Valor_Medio valor_medio;
    private Venda venda;
    private Gerencia_Lote_Corte gerencia_lote_corte;
    private Gerencia_Lote_Postura gerencia_lote_postura;
    
    public void inicializa(){
        coleta_ovos = new Coleta_Ovos();
        item_enciclopedia = new Item_Enciclopedia();
        fase = new Fase();
        galpao = new Galpao();
        gasto = new Gasto();
        lote_cama = new Lote_Cama();
        tipo_cama = new Tipo_Cama();
        lote_equipamento_eletrico = new Lote_Equipamento_Eletrico();
        tipo_equipamento_eletrico = new Tipo_Equipamento_Eletrico();
        lote_gas = new Lote_Gas();
        tipo_gas = new Tipo_Gas();
        lote_medicamento = new Lote_Medicamento();
        tipo_medicamento = new Tipo_Medicamento();
        lote_racao = new Lote_Racao();
        tipo_racao = new Tipo_Racao();
        lote_vacina = new Lote_Vacina();
        tipo_vacina = new Tipo_Vacina();
        horas_luz_dia = new Horas_Luz_Dia();
        linhagem = new Linhagem();
        lote_corte = new Lote_Corte();
        lote_postura = new Lote_Postura();
        mensagem = new Mensagem();
        mortalidade = new Mortalidade();
        tipo_mortalidade = new Tipo_Mortalidade();
        pesagem = new Pesagem();
        valor_medio = new Valor_Medio();
        venda = new Venda();
        gerencia_lote_corte = new Gerencia_Lote_Corte();
        gerencia_lote_postura = new Gerencia_Lote_Postura();
    }
    public void abre(javax.swing.JInternalFrame frame){
        if (!frame.isVisible()){
            jDesktopPane1.add(frame);
            frame.setVisible(true);
        }else{
            frame.moveToFront();
        }
    }
    public void fecha(javax.swing.JInternalFrame frame){
        frame.dispose();
    }
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        inicializa();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu31 = new javax.swing.JMenu();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu20 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenu21 = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu22 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenu23 = new javax.swing.JMenu();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenu24 = new javax.swing.JMenu();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenu25 = new javax.swing.JMenu();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenu26 = new javax.swing.JMenu();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenu17 = new javax.swing.JMenu();
        jMenu27 = new javax.swing.JMenu();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenu28 = new javax.swing.JMenu();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenu18 = new javax.swing.JMenu();
        jMenu29 = new javax.swing.JMenu();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenu30 = new javax.swing.JMenu();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Janelas/Strings"); // NOI18N
        setTitle(bundle.getString("SISGRANJA")); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );

        jMenu1.setText(bundle.getString("Enciclopedia")); // NOI18N

        jMenuItem1.setText(bundle.getString("Abrir_Enciclopedia")); // NOI18N
        jMenuItem1.setEnabled(false);
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText(bundle.getString("Cadastro_Item_Enciclopedia")); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText(bundle.getString("Lista_Item_Enciclopedia")); // NOI18N
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(bundle.getString("Geral")); // NOI18N

        jMenu3.setText(bundle.getString("Fase")); // NOI18N

        jMenuItem5.setText(bundle.getString("Cadastro_Fase")); // NOI18N
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem4.setText(bundle.getString("Exibir_Fase")); // NOI18N
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenu2.add(jMenu3);

        jMenu4.setText(bundle.getString("Galpao")); // NOI18N

        jMenuItem6.setText(bundle.getString("Cadastro_Galpao")); // NOI18N
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText(bundle.getString("Exibir_Galpao")); // NOI18N
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenu2.add(jMenu4);

        jMenu5.setText(bundle.getString("Horas_Luz_Dia")); // NOI18N

        jMenuItem8.setText(bundle.getString("Cadastro_Horas_Luz_Dia")); // NOI18N
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem9.setText(bundle.getString("Exibir_Horas_Luz_Dia")); // NOI18N
        jMenuItem9.setActionCommand(bundle.getString("Cadastro_Horas_Luz_Dia")); // NOI18N
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenu2.add(jMenu5);

        jMenu6.setText(bundle.getString("Linhagem")); // NOI18N

        jMenuItem10.setText(bundle.getString("Cadastro_Linhagem")); // NOI18N
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem11.setText(bundle.getString("Exibir_Linhagem")); // NOI18N
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenu2.add(jMenu6);

        jMenu10.setText(bundle.getString("Mensagem")); // NOI18N

        jMenuItem16.setText(bundle.getString("Cadastro_Mensagem")); // NOI18N
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem16);

        jMenuItem17.setText(bundle.getString("Exibir_Mensagem")); // NOI18N
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem17);

        jMenu2.add(jMenu10);

        jMenu31.setText(bundle.getString("Tipo_Mortalidade")); // NOI18N

        jMenuItem45.setText(bundle.getString("Cadastro_Tipo_Mortalidade")); // NOI18N
        jMenuItem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem45ActionPerformed(evt);
            }
        });
        jMenu31.add(jMenuItem45);

        jMenuItem46.setText(bundle.getString("Exibir_Tipo_Mortalidade")); // NOI18N
        jMenuItem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem46ActionPerformed(evt);
            }
        });
        jMenu31.add(jMenuItem46);

        jMenu2.add(jMenu31);

        jMenu11.setText(bundle.getString("Valor_Medio")); // NOI18N

        jMenuItem18.setText(bundle.getString("Cadastro_Valor_Medio")); // NOI18N
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem18);

        jMenuItem19.setText(bundle.getString("Exibir_Valor_Medio")); // NOI18N
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem19);

        jMenu2.add(jMenu11);

        jMenuBar1.add(jMenu2);

        jMenu12.setText(bundle.getString("Recursos")); // NOI18N

        jMenu13.setText(bundle.getString("Cama")); // NOI18N

        jMenu19.setText(bundle.getString("Lote_Cama")); // NOI18N

        jMenuItem20.setText(bundle.getString("Cadastro_Lote_Cama")); // NOI18N
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenuItem20);

        jMenuItem21.setText(bundle.getString("Exibir_Lote_Cama")); // NOI18N
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenuItem21);

        jMenu13.add(jMenu19);

        jMenu20.setText(bundle.getString("Tipo_Cama")); // NOI18N

        jMenuItem22.setText(bundle.getString("Cadastro_Tipo_Cama")); // NOI18N
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem22);

        jMenuItem23.setText(bundle.getString("Exibir_Tipo_Cama")); // NOI18N
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem23);

        jMenu13.add(jMenu20);

        jMenu12.add(jMenu13);

        jMenu14.setText(bundle.getString("Equipamento_Eletrico")); // NOI18N

        jMenu21.setText(bundle.getString("Lote_Equipamento_Eletrico")); // NOI18N

        jMenuItem24.setText(bundle.getString("Cadastro_Lote_Equipamento_Eletrico")); // NOI18N
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem24);

        jMenuItem25.setText(bundle.getString("Exibir_Lote_Equipamento_Eletrico")); // NOI18N
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem25);

        jMenu14.add(jMenu21);

        jMenu22.setText(bundle.getString("Tipo_Equipamento_Eletrico")); // NOI18N

        jMenuItem26.setText(bundle.getString("Cadastro_Tipo_Equipamento_Eletrico")); // NOI18N
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu22.add(jMenuItem26);

        jMenuItem27.setText(bundle.getString("Exibir_Tipo_Equipamento_Eletrico")); // NOI18N
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu22.add(jMenuItem27);

        jMenu14.add(jMenu22);

        jMenu12.add(jMenu14);

        jMenu15.setText(bundle.getString("Gas")); // NOI18N

        jMenu23.setText(bundle.getString("Lote_Gas")); // NOI18N

        jMenuItem28.setText(bundle.getString("Cadastro_Lote_Gas")); // NOI18N
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu23.add(jMenuItem28);

        jMenuItem29.setText(bundle.getString("Exibir_Lote_Gas")); // NOI18N
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu23.add(jMenuItem29);

        jMenu15.add(jMenu23);

        jMenu24.setText(bundle.getString("Tipo_Gas")); // NOI18N

        jMenuItem30.setText(bundle.getString("Cadastro_Tipo_Gas")); // NOI18N
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu24.add(jMenuItem30);

        jMenuItem31.setText(bundle.getString("Exibir_Tipo_Gas")); // NOI18N
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu24.add(jMenuItem31);

        jMenu15.add(jMenu24);

        jMenu12.add(jMenu15);

        jMenu16.setText(bundle.getString("Medicamento")); // NOI18N

        jMenu25.setText(bundle.getString("Lote_Medicamento")); // NOI18N

        jMenuItem32.setText(bundle.getString("Cadastro_Lote_Medicamento")); // NOI18N
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu25.add(jMenuItem32);

        jMenuItem33.setText(bundle.getString("Exibir_Lote_Medicamento")); // NOI18N
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu25.add(jMenuItem33);

        jMenu16.add(jMenu25);

        jMenu26.setText(bundle.getString("Tipo_Medicamento")); // NOI18N

        jMenuItem34.setText(bundle.getString("Cadastro_Tipo_Medicamento")); // NOI18N
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu26.add(jMenuItem34);

        jMenuItem35.setText(bundle.getString("Exibir_Tipo_Medicamento")); // NOI18N
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu26.add(jMenuItem35);

        jMenu16.add(jMenu26);

        jMenu12.add(jMenu16);

        jMenu17.setText(bundle.getString("Racao")); // NOI18N

        jMenu27.setText(bundle.getString("Lote_Racao")); // NOI18N

        jMenuItem36.setText(bundle.getString("Cadastro_Lote_Racao")); // NOI18N
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu27.add(jMenuItem36);

        jMenuItem37.setText(bundle.getString("Exibir_Lote_Racao")); // NOI18N
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu27.add(jMenuItem37);

        jMenu17.add(jMenu27);

        jMenu28.setText(bundle.getString("Tipo_Racao")); // NOI18N

        jMenuItem38.setText(bundle.getString("Cadastro_Tipo_Racao")); // NOI18N
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu28.add(jMenuItem38);

        jMenuItem39.setText(bundle.getString("Exibir_Tipo_Racao")); // NOI18N
        jMenuItem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem39ActionPerformed(evt);
            }
        });
        jMenu28.add(jMenuItem39);

        jMenu17.add(jMenu28);

        jMenu12.add(jMenu17);

        jMenu18.setText(bundle.getString("Vacina")); // NOI18N

        jMenu29.setText(bundle.getString("Lote_Vacina")); // NOI18N

        jMenuItem40.setText(bundle.getString("Cadastro_Lote_Vacina")); // NOI18N
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu29.add(jMenuItem40);

        jMenuItem41.setText(bundle.getString("Exibir_Lote_Vacina")); // NOI18N
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        jMenu29.add(jMenuItem41);

        jMenu18.add(jMenu29);

        jMenu30.setText(bundle.getString("Tipo_Vacina")); // NOI18N

        jMenuItem42.setText(bundle.getString("Cadastro_Tipo_Vacina")); // NOI18N
        jMenuItem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem42ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem42);

        jMenuItem43.setText(bundle.getString("Exibir_Tipo_Vacina")); // NOI18N
        jMenuItem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem43ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem43);

        jMenu18.add(jMenu30);

        jMenu12.add(jMenu18);

        jMenuBar1.add(jMenu12);

        jMenu7.setText(bundle.getString("Lote")); // NOI18N

        jMenu8.setText(bundle.getString("Lote_Corte")); // NOI18N

        jMenuItem12.setText(bundle.getString("Cadastro_Lote_Corte")); // NOI18N
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem12);

        jMenuItem13.setText(bundle.getString("Exibir_Lote_Corte")); // NOI18N
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem13);

        jMenu7.add(jMenu8);

        jMenu9.setText(bundle.getString("Lote_Postura")); // NOI18N

        jMenuItem14.setText(bundle.getString("Cadastro_Lote_Postura")); // NOI18N
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem14);

        jMenuItem15.setText(bundle.getString("Exibir_Lote_Postura")); // NOI18N
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem15);

        jMenu7.add(jMenu9);

        jMenuItem44.setText(bundle.getString("Gerenciar_Lote")); // NOI18N
        jMenuItem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem44ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem44);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        abre(item_enciclopedia);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Cadastro_Item_Enciclopedia cadastro = new Cadastro_Item_Enciclopedia(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Cadastro_Fase cadastro = new Cadastro_Fase(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        abre(fase);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        abre(galpao);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        abre(horas_luz_dia);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        abre(linhagem);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        abre(mensagem);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
        abre(valor_medio);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        // TODO add your handling code here:
        abre(lote_cama);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        // TODO add your handling code here:
        abre(tipo_cama);
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        // TODO add your handling code here:
        abre(lote_equipamento_eletrico);
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        // TODO add your handling code here:
        abre(tipo_equipamento_eletrico);
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        // TODO add your handling code here:
        abre(lote_gas);
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        // TODO add your handling code here:
        abre(tipo_gas);
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        // TODO add your handling code here:
        abre(lote_medicamento);
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        // TODO add your handling code here:
        abre(tipo_medicamento);
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        // TODO add your handling code here:
        abre(lote_racao);
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void jMenuItem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem39ActionPerformed
        // TODO add your handling code here:
        abre(lote_racao);
    }//GEN-LAST:event_jMenuItem39ActionPerformed

    private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed
        // TODO add your handling code here:
        abre(lote_vacina);
    }//GEN-LAST:event_jMenuItem41ActionPerformed

    private void jMenuItem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem43ActionPerformed
        // TODO add your handling code here:
        abre(tipo_vacina);
    }//GEN-LAST:event_jMenuItem43ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        abre(lote_corte);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        abre(lote_postura);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Cadastro_Galpao cadastro = new Cadastro_Galpao(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        Cadastro_Horas_Luz_Dia cadastro = new Cadastro_Horas_Luz_Dia(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        Cadastro_Linhagem cadastro = new Cadastro_Linhagem(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        Cadastro_Mensagem cadastro = new Cadastro_Mensagem(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        Cadastro_Valor_Medio cadastro = new Cadastro_Valor_Medio(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
        Cadastro_Lote_Cama cadastro = new Cadastro_Lote_Cama(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        // TODO add your handling code here:
        Cadastro_Tipo_Cama cadastro = new Cadastro_Tipo_Cama(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        // TODO add your handling code here:
        Cadastro_Tipo_Equipamento_Eletrico cadastro = new Cadastro_Tipo_Equipamento_Eletrico(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        // TODO add your handling code here:
        Cadastro_Lote_Equipamento_Eletrico cadastro = new Cadastro_Lote_Equipamento_Eletrico(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        // TODO add your handling code here:
        Cadastro_Lote_Gas cadastro = new Cadastro_Lote_Gas(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        // TODO add your handling code here:
        Cadastro_Tipo_Gas cadastro = new Cadastro_Tipo_Gas(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        // TODO add your handling code here:
        Cadastro_Lote_Medicamento cadastro = new Cadastro_Lote_Medicamento(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        // TODO add your handling code here:
        Cadastro_Tipo_Medicamento cadastro = new Cadastro_Tipo_Medicamento(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        // TODO add your handling code here:
        Cadastro_Lote_Racao cadastro = new Cadastro_Lote_Racao(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        // TODO add your handling code here:
        Cadastro_Tipo_Racao cadastro = new Cadastro_Tipo_Racao(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        // TODO add your handling code here:
        Cadastro_Lote_Vacina cadastro = new Cadastro_Lote_Vacina(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem40ActionPerformed

    private void jMenuItem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem42ActionPerformed
        // TODO add your handling code here:
        Cadastro_Tipo_Vacina cadastro = new Cadastro_Tipo_Vacina(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem42ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        Cadastro_Lote_Corte cadastro = new Cadastro_Lote_Corte(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        Cadastro_Lote_Postura cadastro = new Cadastro_Lote_Postura(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem44ActionPerformed
        // TODO add your handling code here:
        Seleciona_Lote seleciona = new Seleciona_Lote(null, true);
        seleciona.setVisible(true);
        Object[] selecao = seleciona.getResposta();
        if (selecao[0]==null){//não selecionou nada
            System.out.println("Nada selecionado.");
        }else{//chamar o gerencia lote com base na selecao
            if (selecao[1]=="Lote de Corte"){//se lote de corte
                gerencia_lote_corte.setEntrada(selecao);
                abre(gerencia_lote_corte);
            }else{//se lote de postura
                //gerencia_lote_postura.setEntrada(selecao);
                abre(gerencia_lote_postura);
            }
        }
    }//GEN-LAST:event_jMenuItem44ActionPerformed

    private void jMenuItem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem45ActionPerformed
        // TODO add your handling code here:
        Cadastro_Tipo_Mortalidade cadastro = new Cadastro_Tipo_Mortalidade(null, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem45ActionPerformed

    private void jMenuItem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem46ActionPerformed
        // TODO add your handling code here:
        abre(tipo_mortalidade);
    }//GEN-LAST:event_jMenuItem46ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu28;
    private javax.swing.JMenu jMenu29;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu30;
    private javax.swing.JMenu jMenu31;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
