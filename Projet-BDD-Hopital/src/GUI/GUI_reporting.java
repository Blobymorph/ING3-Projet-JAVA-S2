/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BDD.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.MidiDevice.Info;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JDialog;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
/*
 import org.jfree.chart.ChartPanel;
 import org.jfree.data.general.DefaultPieDataset;
 import org.jfree.data.general.PieDataset;
 import org.jfree.chart.JFreeChart;
 import org.jfree.chart.ChartFactory;
 */

/**
 *
 * @author Axel
 */
public class GUI_reporting extends javax.swing.JFrame {

    int action;

    /**
     * Creates new form GUI_statistique
     */
    public GUI_reporting() {
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

        lblReporting = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        btnLancerStat = new javax.swing.JButton();
        panelHistogramme = new javax.swing.JPanel();
        lblPopu = new javax.swing.JLabel();
        btnRetour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblReporting.setBackground(new java.awt.Color(153, 153, 153));
        lblReporting.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblReporting.setText("Reporting");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choisir une population", "Nombre d'employé par tranches de salaires", "Nombre d'employé par service", "Nombre d'employé par spécialité", "Nombre d'employé par rotation", "Salaire des employés par service", "Nombre de malades par service", "Nombre de malades par mutuelle", "Nombre de chambres par service" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnLancerStat.setBackground(new java.awt.Color(0, 102, 0));
        btnLancerStat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLancerStat.setText("Lancer l'étude");
        btnLancerStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLancerStatActionPerformed(evt);
            }
        });

        panelHistogramme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelHistogrammeLayout = new javax.swing.GroupLayout(panelHistogramme);
        panelHistogramme.setLayout(panelHistogrammeLayout);
        panelHistogrammeLayout.setHorizontalGroup(
            panelHistogrammeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        panelHistogrammeLayout.setVerticalGroup(
            panelHistogrammeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        lblPopu.setText("Population à étudier :");

        btnRetour.setBackground(new java.awt.Color(255, 0, 0));
        btnRetour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRetour.setText("Retour");
        btnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnLancerStat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRetour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelHistogramme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblReporting, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(222, 222, 222))))
                    .addComponent(lblPopu, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReporting, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lblPopu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btnLancerStat, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addComponent(panelHistogramme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLancerStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLancerStatActionPerformed
        // TODO add your handling code here:

        // faire la requete sql et ranger les variables aux bon endroits
        JDialog reponse = new JDialog();
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String text = "";
        String Infox = "";
        String Infoy = "";
        switch (action) {//////////////////:Pie charts//////////////////////////////////////
            case 1:
                //set values
                pieDataset.setValue("de 700 à 1100", getEmployeParSalaire(1));
                pieDataset.setValue("de 1100 à 1300", getEmployeParSalaire(2));
                pieDataset.setValue("de 1300 à 1700", getEmployeParSalaire(3));
                pieDataset.setValue("Plus de 1700", getEmployeParSalaire(4));
                text = "Nombre d'employés par tranche de salaire";
                break;

            case 2:
                //set values
                pieDataset.setValue("REA", getEmployeParService(1));
                pieDataset.setValue("CHG", getEmployeParService(2));
                pieDataset.setValue("CAR", getEmployeParService(3));
                text = "Nombre d'employés par service";
                break;
            case 3:
                //set values
                pieDataset.setValue("Anesthesiste", getEmployeParSpecialite(1));
                pieDataset.setValue("Cardiologue", getEmployeParSpecialite(2));
                pieDataset.setValue("Generaliste", getEmployeParSpecialite(3));
                pieDataset.setValue("Orthopediste", getEmployeParSpecialite(4));
                pieDataset.setValue("Pneumologue", getEmployeParSpecialite(5));
                pieDataset.setValue("Radiologue", getEmployeParSpecialite(6));
                pieDataset.setValue("Traumatologue", getEmployeParSpecialite(7));
                text = "Nombre d'employés par spécialité";
                break;
            case 4:
                //set values
                pieDataset.setValue("Jour", getEmployeRotation(1));
                pieDataset.setValue("Nuit", getEmployeRotation(2));
                text = "Nombre d'employés par rotation";
                break;
            /// diagrammes en barre/////////////////////////////
            case 5:
                //dataset.addValue(WIDTH, WIDTH, action);
                final String REA = "Moyenne pour REA";
                final String CHG = "Moyenne pour CHG";
                final String CAR = "Moyenne pour CAR";
                final String salaire = "salaire";
                dataset.addValue(getSalaireParService(1), salaire, REA);
                dataset.addValue(getSalaireParService(2), salaire, CHG);
                dataset.addValue(getSalaireParService(3), salaire, CAR);
                Infox = "service";
                Infoy = "salaire";
                text = "Salaire moyen par service";
                break;

            case 6:
                //set values
                final String malade = "Malade";
                final String rea = "REA";
                final String chg = "CHG";
                final String car = "CAR";
                dataset.addValue(getMaladeParService(1), malade, rea);
                dataset.addValue(getMaladeParService(2), malade, chg);
                dataset.addValue(getMaladeParService(3), malade, car);
                Infox = "Service";
                Infoy = "Nombre de malades";
                text = "Nombre de malade par service";
                break;
            case 7:
                //set values
                final String MAAF = "MAAF";
                final String MNAM = "MNAM";
                final String LMDE = "LMDE";
                final String MNH = "MNH";
                final String MGEN = "MGEN";
                final String MMA = "MMA";
                final String CNAMTS = "CNAMTS";
                final String CCVRP = "CCVRP";
                final String MAS = "MAS";
                final String AG2R = "AG2R";
                final String MNFTC = "MNFTC";
                final String MGSP = "MGSP";
                final String salaire0 = "Mutuelle";
                Infox = "Mutuelle";
                Infoy = "Malades";
                text = "Nombre de malades par mutuelle";

//                      / init
                dataset.addValue(getMaladeParMutuelle(1), salaire0, MAAF);
                dataset.addValue(getMaladeParMutuelle(2), salaire0, MNAM);
                dataset.addValue(getMaladeParMutuelle(3), salaire0, LMDE);
                dataset.addValue(getMaladeParMutuelle(4), salaire0, MNH);
                dataset.addValue(getMaladeParMutuelle(5), salaire0, MGEN);
                dataset.addValue(getMaladeParMutuelle(6), salaire0, MMA);
                dataset.addValue(getMaladeParMutuelle(7), salaire0, CNAMTS);
                dataset.addValue(getMaladeParMutuelle(8), salaire0, CCVRP);
                dataset.addValue(getMaladeParMutuelle(9), salaire0, MAS);
                dataset.addValue(getMaladeParMutuelle(10), salaire0, AG2R);
                dataset.addValue(getMaladeParMutuelle(11), salaire0, MNFTC);
                dataset.addValue(getMaladeParMutuelle(12), salaire0, MGSP);
                break;

            case 8:
                //set values
                final String malades = "Chambre";
                final String reas = "REA";
                final String chgs = "CHG";
                final String cars = "CAR";
                dataset.addValue(getChambreParService(1), malades, reas);
                dataset.addValue(getChambreParService(2), malades, chgs);
                dataset.addValue(getChambreParService(3), malades, cars);
                Infox = "Service";
                Infoy = "Nombre de chambre";
                text = "Nombre de chambre par service";
                break;

            default:
                break;

        }
        // Piechart
        if (action > 0 && action < 5) {
            final JFreeChart pieChart = ChartFactory.createPieChart(text, pieDataset, true, false, false);
            final ChartPanel cPanel = new ChartPanel(pieChart);
            reponse.add(cPanel);
            reponse.pack();
            //panelHistogramme.pack();
            reponse.setVisible(true);
        }
        //Histogramme
        if (action > 4 && action < 11) {

            final JFreeChart barChart = ChartFactory.createBarChart(text, Infox, Infoy, dataset, PlotOrientation.VERTICAL, true, true, false);
            final ChartPanel cPanel = new ChartPanel(barChart);
            reponse.add(cPanel);
            reponse.pack();
            //panelHistogramme.pack();
            reponse.setVisible(true);
        }

        /*
         DefaultPieDataset pieDataset = new DefaultPieDataset(); 
         pieDataset.setValue("Valeur1", new Integer(27)); 
         pieDataset.setValue("Valeur2", new Integer(10)); 
         pieDataset.setValue("Valeur3", new Integer(50)); 
         pieDataset.setValue("Valeur4", new Integer(5)); 
         JFreeChart pieChart = ChartFactory.createPieChart("Test camembert",pieDataset, true, true, true); 
         ChartPanel cPanel = new ChartPanel(pieChart); 
         panelHistogramme.add(cPanel); 
         */

    }//GEN-LAST:event_btnLancerStatActionPerformed

    //demande le nombre de salarié par tranche
    int getEmployeParSalaire(int tranche) {
        int value = 0;
        String inter;
        String Requete;
        try {
            Connexion C = new Connexion("password.txt");

            ArrayList<String> Values = new ArrayList<String>();

            String min = "";
            String max = "";
            //recuperation des bornes
            switch (tranche) {
                case 1:
                    min = "700";
                    max = "1100";
                    break;

                case 2:
                    min = "1100";
                    max = "1300";
                    break;
                case 3:
                    min = "1300";
                    max = "1700";
                    break;
                case 4:
                    min = "1700";
                    max = "200000";
            }
            Requete = "select  count(*) from employe,infirmier where employe.numero = infirmier.numero and infirmier.salaire between '" + min + "' and '" + max + "'";
            System.out.println(Requete);
            Values = C.remplirChampsRequete(Requete);
            for (String s : Values) {
                System.out.println(s);
            }

            inter = Values.get(0);
            inter = inter.replace("\n", "").replace("\r", "");
            System.out.println("'" + inter + "'");
            value = Integer.parseInt(inter);

//connexion
            C.destroy();
        } catch (SQLException ex) {
            Logger.getLogger(GUI_rechercher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_rechercher.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }

    //demande le nombre d'employé par service
    int getEmployeParService(int num_service) {
        String inter;
        String service;
        String Requete;
        int value = 0;
        try {

            Connexion C = new Connexion("password.txt");

            ArrayList<String> Values = new ArrayList<String>();
            //recuperation des donnee
            switch (num_service) {
                case 1:
                    service = "REA";
                    Requete = "select  count(*) from employe,infirmier where employe.numero = infirmier.numero and infirmier.code_service='REA'";
                    break;
                case 2:
                    service = "CHG";
                    Requete = "select  count(*) from employe,infirmier where employe.numero = infirmier.numero and infirmier.code_service='CHG'";
                    break;
                case 3:
                    service = "CAR";
                    Requete = "select  count(*) from employe,infirmier where employe.numero = infirmier.numero and infirmier.code_service='CAR'";
                    break;
                default:
                    Requete = "";
            }

            System.out.println(Requete);
            Values = C.remplirChampsRequete(Requete);
            for (String s : Values) {
                System.out.println(s);
            }

            inter = Values.get(0);
            inter = inter.replace("\n", "").replace("\r", "");
            System.out.println("'" + inter + "'");
            value = Integer.parseInt(inter);

//connexion
            C.destroy();
        } catch (SQLException ex) {
            Logger.getLogger(GUI_rechercher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_rechercher.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }

    //demande le nombre d'employés par spécialité
    int getEmployeParSpecialite(int num_spe) {
        String inter;
        String Requete;
        int value = 0;
        String specialite = "";

        try {

            Connexion C = new Connexion("password.txt");

            ArrayList<String> Values = new ArrayList<String>();
            switch (num_spe) {
                case 1:
                    specialite = "Anesthesiste";
                    Requete = "select  count(*) from employe,docteur where employe.numero = docteur.numero and docteur.specialite='Anesthesiste'";
                    break;
                case 2:
                    specialite = "Cardiologue";
                    Requete = "select  count(*) from employe,docteur where employe.numero = docteur.numero and docteur.specialite='Cardiologue'";
                    break;
                case 3:
                    specialite = "Generaliste";
                    Requete = "select  count(*) from employe,docteur where employe.numero = docteur.numero and docteur.specialite='Generaliste'";
                    break;
                case 4:
                    specialite = "Orthopediste";
                    Requete = "select  count(*) from employe,docteur where employe.numero = docteur.numero and docteur.specialite='Orthopediste'";
                    break;
                case 5:
                    specialite = "Pneumologue";
                    Requete = "select  count(*) from employe,docteur where employe.numero = docteur.numero and docteur.specialite='Pneumologue'";
                    break;
                case 6:
                    specialite = "Radiologue";
                    Requete = "select  count(*) from employe,docteur where employe.numero = docteur.numero and docteur.specialite='Radiologue'";
                    break;
                case 7:
                    specialite = "Traumatologue";
                    Requete = "select  count(*) from employe,docteur where employe.numero = docteur.numero and docteur.specialite='Traumatologue'";
                    break;
                default:
                    Requete = "";
            }
            System.out.println(Requete);
            Values = C.remplirChampsRequete(Requete);
            for (String s : Values) {
                System.out.println(s);
            }

            inter = Values.get(0);
            inter = inter.replace("\n", "").replace("\r", "");
            System.out.println("'" + inter + "'");
            value = Integer.parseInt(inter);

//connexion
            C.destroy();
        } catch (SQLException ex) {
            Logger.getLogger(GUI_rechercher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_rechercher.class.getName()).log(Level.SEVERE, null, ex);
        }

        return value;
    }

    //demande le d'employé par rotation
    int getEmployeRotation(int Day) {
        String inter;
        String service;
        String Requete;
        int value = 0;
        try {

            Connexion C = new Connexion("password.txt");

            ArrayList<String> Values = new ArrayList<String>();
            String Periode = "";

            switch (Day) {
                case 1:
                    Requete = "select  count(*) from employe,infirmier where employe.numero = infirmier.numero and infirmier.rotation='JOUR'";
                    Periode = "JOUR";
                    break;
                case 2:
                    Requete = "select  count(*) from employe,infirmier where employe.numero = infirmier.numero and infirmier.rotation='NUIT'";
                    Periode = "NUIT";
                    break;
                default:
                    Requete = "";
            }
            System.out.println(Requete);
            Values = C.remplirChampsRequete(Requete);
            for (String s : Values) {
                System.out.println(s);
            }

            inter = Values.get(0);
            inter = inter.replace("\n", "").replace("\r", "");
            System.out.println("'" + inter + "'");
            value = Integer.parseInt(inter);

//connexion
            C.destroy();
        } catch (SQLException ex) {
            Logger.getLogger(GUI_rechercher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_rechercher.class.getName()).log(Level.SEVERE, null, ex);
        }

        return value;
    }

    //demande la moyenne de salaire par service
    int getSalaireParService(int num_service) {
        String inter;
        String Requete;
        String service = "";
        int value = 0;
        try {

            Connexion C = new Connexion("password.txt");

            ArrayList<String> Values = new ArrayList<String>();
            String Periode = "";
            //recuperation des donnee
            switch (num_service) {
                case 1:
                    Requete = "select  AVG(salaire) from employe,infirmier where employe.numero = infirmier.numero and infirmier.code_service='REA'";
                    service = "REA";
                    break;
                case 2:
                    Requete = "select  AVG(salaire) from employe,infirmier where employe.numero = infirmier.numero and infirmier.code_service='CHG'";
                    service = "CHG";
                    break;
                case 3:
                    Requete = "select  AVG(salaire) from employe,infirmier where employe.numero = infirmier.numero and infirmier.code_service='CAR'";
                    service = "CAR";
                    break;
                default:
                    Requete = "";
            }
            System.out.println(Requete);
            Values = C.remplirChampsRequete(Requete);
            for (String s : Values) {
                System.out.println(s);
            }

            inter = Values.get(0);
            inter = inter.replace("\n", "").replace("\r", "");
            System.out.println("'" + inter + "'");
            value = (int) Double.parseDouble(inter);

//connexion
            C.destroy();
        } catch (SQLException ex) {
            Logger.getLogger(GUI_rechercher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_rechercher.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }
    /*
     //demande le salaire moyen par profession
     int getSalaireParSpecialite(int num_spe) {
     String specialite = "";
     String inter;
     String Requete="";
     String service = "";
     int value = 0;
     try {

     Connexion C = new Connexion("password.txt");

     ArrayList<String> Values = new ArrayList<String>();
     String Periode = "";
     switch (num_spe) {
     case 1:
     specialite = "Anesthesiste";
     Requete = "select  AVG(salaire) from employe,docteur where employe.numero = docteur.numero and docteur.specialite='"+specialite+"'";
     break;
     case 2:
     specialite = "Cardiologue";
     Requete = "select  AVG(salaire) from employe,docteur where employe.numero = docteur.numero and docteur.specialite='"+specialite+"'";
     break;
     case 3:
     specialite = "Generaliste";
     Requete = "select  AVG(salaire) from employe,docteur where employe.numero = docteur.numero and docteur.specialite='"+specialite+"'";
     break;
     case 4:
     specialite = "Orthopediste";
     Requete = "select  AVG(salaire) from employe,docteur where employe.numero = docteur.numero and docteur.specialite='"+specialite+"'";
     break;
     case 5:
     specialite = "Pneumologue";
     Requete = "select  AVG(salaire) from employe,docteur where employe.numero = docteur.numero and docteur.specialite='"+specialite+"'";
     break;
     case 6:
     specialite = "Radiologue";
     Requete = "select  AVG(salaire) from employe,docteur where employe.numero = docteur.numero and docteur.specialite='"+specialite+"'";
     break;
     case 7:
     specialite = "Traumatologue";
     Requete = "select  AVG(salaire) from employe,docteur where employe.numero = docteur.numero and docteur.specialite='"+specialite+"'";
     break;
     }
     System.out.println(Requete);
     Values = C.remplirChampsRequete(Requete);
     for (String s : Values) {
     System.out.println(s);
     }

     inter = Values.get(0);
     inter = inter.replace("\n", "").replace("\r", "");
     System.out.println("'" + inter + "'");
     value = (int) Double.parseDouble(inter);

     //connexion
     C.destroy();
     } catch (SQLException ex) {
     Logger.getLogger(GUI_rechercher.class.getName()).log(Level.SEVERE, null, ex);
     } catch (ClassNotFoundException ex) {
     Logger.getLogger(GUI_rechercher.class.getName()).log(Level.SEVERE, null, ex);
     }

     return value;
     }

     //demande le samaire moyen par metier
     int getSalaireParMetier(int met) {
     String service;
     int value = 0;
     //recuperation des donnee
     switch (met) {
     case 1:
     service = "Docteur";
     break;
     case 2:
     service = "Infirmier";
     break;
     case 3:
     service = "autres";
     break;
     }
     return value;
     }
     */

    //demande le nombre de malades par service
    int getMaladeParService(int num_service) {
        String inter;
        String Requete = "";
        String service = "";
        int value = 0;
        try {

            Connexion C = new Connexion("password.txt");

            ArrayList<String> Values = new ArrayList<String>();
            String Periode = "";
            //recuperation des donnee
            switch (num_service) {
                case 1:
                    service = "REA";
                    Requete = "select  count(*) from malade,hospitalisation where malade.numero = hospitalisation.no_malade and hospitalisation.code_service='" + service + "'";
                    break;
                case 2:
                    service = "CHG";
                    Requete = "select  count(*) from malade,hospitalisation where malade.numero = hospitalisation.no_malade and hospitalisation.code_service='" + service + "'";
                    break;
                case 3:
                    service = "CAR";
                    Requete = "select  count(*) from malade,hospitalisation where malade.numero = hospitalisation.no_malade and hospitalisation.code_service='" + service + "'";
                    break;
            }
            System.out.println(Requete);
            Values = C.remplirChampsRequete(Requete);
            for (String s : Values) {
                System.out.println(s);
            }

            inter = Values.get(0);
            inter = inter.replace("\n", "").replace("\r", "");
            System.out.println("'" + inter + "'");
            value = (int) Double.parseDouble(inter);

//connexion
            C.destroy();
        } catch (SQLException ex) {
            Logger.getLogger(GUI_rechercher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_rechercher.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }

    //demande le nombre de chambre du service
    int getChambreParService(int num_service) {
        String inter;
        String Requete = "";
        String service = "";
        int value = 0;
        try {

            Connexion C = new Connexion("password.txt");

            ArrayList<String> Values = new ArrayList<String>();
            String Periode = "";
            //recuperation des donnee
            switch (num_service) {
                case 1:
                    service = "REA";
                    Requete = "select  count(*) from chambre where chambre.code_service ='" + service + "'";
                    break;
                case 2:
                    service = "CHG";
                    Requete = "select  count(*) from chambre where chambre.code_service ='" + service + "'";
                    break;
                case 3:
                    service = "CAR";
                    Requete = "select  count(*) from chambre where chambre.code_service ='" + service + "'";
                    break;
            }
            System.out.println(Requete);
            Values = C.remplirChampsRequete(Requete);
            for (String s : Values) {
                System.out.println(s);
            }

            inter = Values.get(0);
            inter = inter.replace("\n", "").replace("\r", "");
            System.out.println("'" + inter + "'");
            value = (int) Double.parseDouble(inter);

//connexion
            C.destroy();
        } catch (SQLException ex) {
            Logger.getLogger(GUI_rechercher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_rechercher.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }

    //retourne le nombre de patients par mutuelle
    int getMaladeParMutuelle(int num_mut) {
        String inter;
        String Requete = "";
        String specialite = "";
        int value = 0;
        try {

            Connexion C = new Connexion("password.txt");

            ArrayList<String> Values = new ArrayList<String>();
            String Periode = "";
            switch (num_mut) {
                case 1:
                    specialite = "MAAF";
                    Requete = "select  count(*) from malade where malade.mutuelle  ='" + specialite + "'";
                    break;
                case 2:
                    specialite = "MNAM";
                    Requete = "select  count(*) from malade where malade.mutuelle ='" + specialite + "'";
                    break;
                case 3:
                    specialite = "LMDE";
                    Requete = "select  count(*) from malade where malade.mutuelle ='" + specialite + "'";
                    break;
                case 4:
                    specialite = "MNH";
                    Requete = "select  count(*) from malade where malade.mutuelle ='" + specialite + "'";
                    break;
                case 5:
                    specialite = "MGEN";
                    Requete = "select  count(*) from malade where malade.mutuelle ='" + specialite + "'";
                    break;
                case 6:
                    specialite = "MMA";
                    Requete = "select  count(*) from malade where malade.mutuelle ='" + specialite + "'";
                    break;
                case 7:
                    specialite = "CNAMTS";
                    Requete = "select  count(*) from malade where malade.mutuelle ='" + specialite + "'";
                    break;
                case 8:
                    specialite = "CCVRP";
                    Requete = "select  count(*) from malade where malade.mutuelle ='" + specialite + "'";
                    break;
                case 9:
                    specialite = "MAS";
                    Requete = "select  count(*) from malade where malade.mutuelle ='" + specialite + "'";
                    break;
                case 10:
                    specialite = "AG2R";
                    Requete = "select  count(*) from malade where malade.mutuelle ='" + specialite + "'";
                    break;
                case 11:
                    specialite = "MNFTC";
                    Requete = "select  count(*) from malade where malade.mutuelle ='" + specialite + "'";
                    break;
                case 12:
                    specialite = "MGSP";
                    Requete = "select  count(*) from malade where malade.mutuelle ='" + specialite + "'";
                    break;
            }
            System.out.println(Requete);
            Values = C.remplirChampsRequete(Requete);
            for (String s : Values) {
                System.out.println(s);
            }

            inter = Values.get(0);
            inter = inter.replace("\n", "").replace("\r", "");
            System.out.println("'" + inter + "'");
            value = (int) Double.parseDouble(inter);

//connexion
            C.destroy();
        } catch (SQLException ex) {
            Logger.getLogger(GUI_rechercher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_rechercher.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }


    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:

        if ((jComboBox1.getSelectedIndex() != 0) || (jComboBox1.getSelectedIndex() != -1)) {
            action = jComboBox1.getSelectedIndex();

        }

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void btnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourActionPerformed
        // TODO add your handling code here:
        GUI_Hospital ghosto = new GUI_Hospital();
        this.dispose();
        ghosto.setVisible(true);
    }//GEN-LAST:event_btnRetourActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_reporting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_reporting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_reporting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_reporting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_reporting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLancerStat;
    private javax.swing.JButton btnRetour;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel lblPopu;
    private javax.swing.JLabel lblReporting;
    private javax.swing.JPanel panelHistogramme;
    // End of variables declaration//GEN-END:variables
}
