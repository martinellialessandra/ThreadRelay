package threadrelay;
/**
 *
 * @author martinelli.alessandr
 */
import javax.swing.SwingUtilities;


public class Gara extends javax.swing.JFrame implements Observer {

    /** Icone 🏃 che scorrono sopra le progress bar (lblThread1..4). */
    private javax.swing.JLabel[] iconeRunners;

    /** Etichette del punteggio nei pannelli laterali (lblTempo1..4). */
    private javax.swing.JLabel[] testiPunteggi;

    private Runner[] runnersAttivi = new Runner[4];

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(Gara.class.getName());


    public Gara() {
        initComponents();

        iconeRunners = new javax.swing.JLabel[]{
            lblThread1, lblThread2, lblThread3, lblThread4
        };
        testiPunteggi = new javax.swing.JLabel[]{
            lblTempo1, lblTempo2, lblTempo3, lblTempo4
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        pnlBase     = new javax.swing.JPanel();
        cmbVelocita = new javax.swing.JComboBox<>();
        btnAvvia    = new javax.swing.JButton();
        btnSospendi = new javax.swing.JButton();
        btnFerma    = new javax.swing.JButton();
        btnRiprendi = new javax.swing.JButton();
        lblThread4  = new javax.swing.JLabel();
        lblThread3  = new javax.swing.JLabel();
        lblThread2  = new javax.swing.JLabel();
        lblThread1  = new javax.swing.JLabel();
        pnlRunner1  = new javax.swing.JPanel();
        lblRunner1  = new javax.swing.JLabel();
        lblTempo1   = new javax.swing.JLabel();
        pnlRunner3  = new javax.swing.JPanel();
        lblRunner3  = new javax.swing.JLabel();
        lblTempo3   = new javax.swing.JLabel();
        pnlRunner4  = new javax.swing.JPanel();
        lblRunner4  = new javax.swing.JLabel();
        lblTempo4   = new javax.swing.JLabel();
        pnlRunner2  = new javax.swing.JPanel();
        lblRunner2  = new javax.swing.JLabel();
        lblTempo2   = new javax.swing.JLabel();
        pgbRunner1  = new javax.swing.JProgressBar();
        pgbRunner3  = new javax.swing.JProgressBar();
        pgbRunner2  = new javax.swing.JProgressBar();
        pgbRunner4  = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBase.setLayout(null);

        cmbVelocita.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[]{"Slow", "Regular", "Fast"}));
        pnlBase.add(cmbVelocita);
        cmbVelocita.setBounds(12, 250, 74, 22);

        btnAvvia.setText("Avvia");
        // FIX: nome metodo allineato a quello definito sotto
        btnAvvia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvviaActionPerformed(evt);
            }
        });
        pnlBase.add(btnAvvia);
        btnAvvia.setBounds(90, 250, 72, 23);

        btnSospendi.setText("Sospendi");
        btnSospendi.setEnabled(false);
        // FIX: nome metodo allineato a quello definito sotto
        btnSospendi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSospendiActionPerformed(evt);
            }
        });
        pnlBase.add(btnSospendi);
        btnSospendi.setBounds(170, 250, 80, 23);

        btnFerma.setText("Ferma");
        btnFerma.setEnabled(false);
        // FIX: nome metodo allineato a quello definito sotto
        btnFerma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermaActionPerformed(evt);
            }
        });
        pnlBase.add(btnFerma);
        btnFerma.setBounds(260, 250, 72, 23);

        btnRiprendi.setText("Riprendi");
        btnRiprendi.setEnabled(false);
        // FIX: nome metodo allineato a quello definito sotto
        btnRiprendi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRiprendiActionPerformed(evt);
            }
        });
        pnlBase.add(btnRiprendi);
        btnRiprendi.setBounds(340, 250, 80, 23);

        lblThread4.setText("🏃");
        pnlBase.add(lblThread4);
        lblThread4.setBounds(20, 210, 12, 16);

        lblThread3.setText("🏃");
        pnlBase.add(lblThread3);
        lblThread3.setBounds(20, 150, 12, 16);

        lblThread2.setText("🏃");
        pnlBase.add(lblThread2);
        lblThread2.setBounds(20, 90, 12, 16);

        lblThread1.setText("🏃");
        pnlBase.add(lblThread1);
        lblThread1.setBounds(20, 30, 12, 16);

        // --- pnlRunner1 ---
        pnlRunner1.setBackground(new java.awt.Color(153, 204, 255));
        lblRunner1.setText("Runner 1");
        lblTempo1.setText("0");
        javax.swing.GroupLayout pnlRunner1Layout = new javax.swing.GroupLayout(pnlRunner1);
        pnlRunner1.setLayout(pnlRunner1Layout);
        pnlRunner1Layout.setHorizontalGroup(
            pnlRunner1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRunner1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRunner1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(lblTempo1)
                .addContainerGap())
        );
        pnlRunner1Layout.setVerticalGroup(
            pnlRunner1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                pnlRunner1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlRunner1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRunner1)
                    .addComponent(lblTempo1))
                .addGap(19, 19, 19))
        );
        pnlBase.add(pnlRunner1);
        pnlRunner1.setBounds(397, 6, 122, 55);   // FIX: larghezza era 0

        // --- pnlRunner2 ---
        pnlRunner2.setBackground(new java.awt.Color(153, 204, 255));
        lblRunner2.setText("Runner 2");
        lblTempo2.setText("0");
        javax.swing.GroupLayout pnlRunner2Layout = new javax.swing.GroupLayout(pnlRunner2);
        pnlRunner2.setLayout(pnlRunner2Layout);
        pnlRunner2Layout.setHorizontalGroup(
            pnlRunner2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRunner2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRunner2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTempo2)
                .addContainerGap())
        );
        pnlRunner2Layout.setVerticalGroup(
            pnlRunner2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRunner2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlRunner2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRunner2)
                    .addComponent(lblTempo2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBase.add(pnlRunner2);
        pnlRunner2.setBounds(397, 67, 122, 55);

        // --- pnlRunner3 ---
        pnlRunner3.setBackground(new java.awt.Color(153, 204, 255));
        lblRunner3.setText("Runner 3");
        lblTempo3.setText("0");
        javax.swing.GroupLayout pnlRunner3Layout = new javax.swing.GroupLayout(pnlRunner3);
        pnlRunner3.setLayout(pnlRunner3Layout);
        pnlRunner3Layout.setHorizontalGroup(
            pnlRunner3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRunner3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRunner3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTempo3)
                .addContainerGap())
        );
        pnlRunner3Layout.setVerticalGroup(
            pnlRunner3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRunner3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlRunner3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRunner3)
                    .addComponent(lblTempo3))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlBase.add(pnlRunner3);
        pnlRunner3.setBounds(397, 128, 122, 55);  // FIX: altezza era 0

        // --- pnlRunner4 ---
        pnlRunner4.setBackground(new java.awt.Color(153, 204, 255));
        lblRunner4.setText("Runner 4");
        lblTempo4.setText("0");
        javax.swing.GroupLayout pnlRunner4Layout = new javax.swing.GroupLayout(pnlRunner4);
        pnlRunner4.setLayout(pnlRunner4Layout);
        pnlRunner4Layout.setHorizontalGroup(
            pnlRunner4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRunner4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRunner4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(lblTempo4)
                .addContainerGap())
        );
        pnlRunner4Layout.setVerticalGroup(
            pnlRunner4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRunner4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlRunner4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRunner4)
                    .addComponent(lblTempo4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBase.add(pnlRunner4);
        pnlRunner4.setBounds(397, 189, 122, 55);  // FIX: larghezza era 0

        // --- Progress bar ---
        pnlBase.add(pgbRunner1);
        pgbRunner1.setBounds(10, 10, 380, 50);
        pnlBase.add(pgbRunner2);
        pgbRunner2.setBounds(10, 70, 380, 50);
        pnlBase.add(pgbRunner3);
        pgbRunner3.setBounds(10, 130, 380, 50);
        pnlBase.add(pgbRunner4);
        pgbRunner4.setBounds(10, 190, 380, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBase,
                    javax.swing.GroupLayout.PREFERRED_SIZE, 540,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBase,
                    javax.swing.GroupLayout.PREFERRED_SIZE, 284,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }
    // </editor-fold>


    
    private void btnAvviaActionPerformed(java.awt.event.ActionEvent evt) {
        int sel = cmbVelocita.getSelectedIndex();
        int v;
        if (sel == 0) {
            v = 100;        // Slow
        } else if (sel == 2) {
            v = 10;         // Fast
        } else {
            v = 50;         // Regular
        }

        for (int i = 0; i < 4; i++) {
            runnersAttivi[i] = new Runner(i + 1, v);
            runnersAttivi[i].addObserver(this);
        }

        runnersAttivi[0].setProssimoRunner(runnersAttivi[1]);
        runnersAttivi[1].setProssimoRunner(runnersAttivi[2]);
        runnersAttivi[2].setProssimoRunner(runnersAttivi[3]);
        runnersAttivi[3].setProssimoRunner(null);

        for (javax.swing.JLabel icona : iconeRunners) {
            icona.setLocation(10, icona.getY());
        }
        for (javax.swing.JLabel testo : testiPunteggi) {
            testo.setText("0");
        }

        btnAvvia.setEnabled(false);          
        cmbVelocita.setEnabled(false);       
        btnSospendi.setEnabled(true);        
        btnFerma.setEnabled(true);           
        btnRiprendi.setEnabled(false);       

        new Thread(runnersAttivi[0]).start();
    }

   
    private void btnSospendiActionPerformed(java.awt.event.ActionEvent evt) {
        for (Runner r : runnersAttivi) {
            if (r != null) r.sospendi();
        }
        btnRiprendi.setEnabled(true);       
        btnSospendi.setEnabled(false);       
    }

 
    private void btnRiprendiActionPerformed(java.awt.event.ActionEvent evt) {
        for (Runner r : runnersAttivi) {
            if (r != null) r.riprendi();
        }
        btnRiprendi.setEnabled(false);       
        btnSospendi.setEnabled(true);        
    }

   
    private void btnFermaActionPerformed(java.awt.event.ActionEvent evt) {
        for (Runner r : runnersAttivi) {
            if (r != null) r.ferma();
        }
        btnAvvia.setEnabled(true);           
        cmbVelocita.setEnabled(true);        
        btnSospendi.setEnabled(false);       
        btnRiprendi.setEnabled(false);       
        btnFerma.setEnabled(false);          
    }

    /**
     * Riceve la posizione aggiornata dal Runner.
     * L'icona 🏃 viene spostata proporzionalmente dentro i 380 px della progress bar.
     */
    @Override
    public void update(int idRunner, int posizione) {
        SwingUtilities.invokeLater(() -> {
            int indice = idRunner - 1;

            testiPunteggi[indice].setText(String.valueOf(posizione));

            
            javax.swing.JLabel icona = iconeRunners[indice];
            int larghezzaCorsia    = 380;
            int spazioPercorribile = larghezzaCorsia - icona.getWidth();
            int nuovaX             = 10 + (posizione * spazioPercorribile) / 99;
            icona.setLocation(nuovaX, icona.getY());
            javax.swing.JProgressBar pgb = new javax.swing.JProgressBar[]{
                pgbRunner1, pgbRunner2, pgbRunner3, pgbRunner4
            }[indice];
            pgb.setValue(posizione);
        });
    }

    /**
     * Riceve la notifica di fine corsa dal Runner.
     */
    @Override
    public void corsaFinita(int idRunner) {
        SwingUtilities.invokeLater(() -> {
            testiPunteggi[idRunner - 1].setText("Fine");
            if (idRunner == 4) {
                btnAvvia.setEnabled(true);       
                cmbVelocita.setEnabled(true);    
                btnSospendi.setEnabled(false);   
                btnFerma.setEnabled(false);      
                btnRiprendi.setEnabled(false);   
            }
        });
    }

   

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new Gara().setVisible(true));
    }

    

    
    private javax.swing.JButton btnAvvia;
    private javax.swing.JButton btnFerma;
    private javax.swing.JButton btnRiprendi;
    private javax.swing.JButton btnSospendi;
    private javax.swing.JComboBox<String> cmbVelocita;
    private javax.swing.JLabel lblRunner1;
    private javax.swing.JLabel lblRunner2;
    private javax.swing.JLabel lblRunner3;
    private javax.swing.JLabel lblRunner4;
    private javax.swing.JLabel lblTempo1;
    private javax.swing.JLabel lblTempo2;
    private javax.swing.JLabel lblTempo3;
    private javax.swing.JLabel lblTempo4;
    private javax.swing.JLabel lblThread1;
    private javax.swing.JLabel lblThread2;
    private javax.swing.JLabel lblThread3;
    private javax.swing.JLabel lblThread4;
    private javax.swing.JProgressBar pgbRunner1;
    private javax.swing.JProgressBar pgbRunner2;
    private javax.swing.JProgressBar pgbRunner3;
    private javax.swing.JProgressBar pgbRunner4;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlRunner1;
    private javax.swing.JPanel pnlRunner2;
    private javax.swing.JPanel pnlRunner3;
    private javax.swing.JPanel pnlRunner4;
    
}
