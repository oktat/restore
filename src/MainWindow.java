/*
 * Nagy János, 2022-11-11
 * Copyright (c) 2022, Nagy János
 * Licenc: MIT 
 */

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class MainWindow extends JFrame {
    /* title azaz fő felirat "Raktár" 
     * A főablak tetején jelenik meg,
     * mint minden program esetén, talán
     * célszerű ide tenni.
    */
    JLabel afel;
    /* eancode felirata "ean kód" */
    JLabel efel;
    /* eancode beviteli mezője */
    JTextField encdf;
    /* eancode és felirat és bevitelimező panelje */
    JPanel enddfpan;

    /* Itt következik a nevecske */
    /* name felirata */
    JLabel nl;
    /* name bevitelimező */
    JTextField nf;
    /* name panelje */
    JPanel pane;
    /* quantity azaz a mennyiség felirata */
    JLabel ql;
    /* quantity bevitelimezője */
    JTextField fq;
    /* quantity panelje */
    JPanel panq;
    /* save, azaz Mentés gomb */
    JButton c;
    /* Button azért került panelre, mert így lesz 
    egy kis szegélyse automatikusan */
    JPanel buttonPanel;

    public MainWindow() {
        Border border = new EmptyBorder(10, 2, 10, 10);
        this.afel = new JLabel("Raktár");
        this.efel = new JLabel("EAN kód");
        this.encdf = new JTextField();
        this.enddfpan = new JPanel();
        this.enddfpan.setLayout(new BoxLayout(this.enddfpan, BoxLayout.LINE_AXIS));
        this.enddfpan.add(this.efel);
        this.enddfpan.add(this.encdf);
        this.enddfpan.setPreferredSize(new Dimension(200, 39));
        this.enddfpan.setBorder(border);
        this.efel.setHorizontalAlignment(SwingConstants.CENTER);
        this.efel.setPreferredSize(new Dimension(100, 15));
        this.nl = new JLabel("Név");this.nf = new JTextField();
this.pane = new JPanel();
    this.pane.setLayout(new BoxLayout(this.pane, BoxLayout.LINE_AXIS));
   this.pane.add(this.nl);this.pane.add(this.nf);
        this.pane.setPreferredSize(new Dimension(200, 39));
        this.pane.setBorder(border);
        this.nl.setHorizontalAlignment(SwingConstants.CENTER);
        this.nl.setPreferredSize(new Dimension(100, 15));
        this.ql = new JLabel("Mennyiség");
        this.fq = new JTextField();
        this.panq = new JPanel();
        this.panq.setLayout(new BoxLayout(this.panq, BoxLayout.LINE_AXIS));
        this.panq.add(this.ql);
        this.panq.add(this.fq);
        this.panq.setPreferredSize(new Dimension(200, 39));
        this.panq.setBorder(border);
        this.ql.setHorizontalAlignment(SwingConstants.CENTER);
        this.ql.setPreferredSize(new Dimension(100, 15));
        this.c = new JButton("Mentés");
        this.buttonPanel = new JPanel();
        this.buttonPanel.add(this.c);
        this.c.addActionListener(new ActionListener() {  @Override  public void actionPerformed(ActionEvent e) {a();}});
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.add(this.afel);
        this.add(this.enddfpan);
        add(this.pane);this.add(this.panq);
        add(this.buttonPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
    private void a() {
        System.out.println(this.encdf.getText());
        System.out.println(this.nf.getText());
        System.out.println(this.fq.getText());
    }
    
}
