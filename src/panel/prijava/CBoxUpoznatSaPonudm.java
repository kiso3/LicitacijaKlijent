/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.prijava;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

/**
 *
 * @author Mladen
 */
public class CBoxUpoznatSaPonudm extends JPanel {
    public JCheckBox jCheckBox ;
    
    public CBoxUpoznatSaPonudm(){
        kreirajKomponente();
        pokreniMenadzeraRasporedaKomponeti();        
        postaviJCheckBox();
    }
    
    private void kreirajKomponente(){
        jCheckBox = new JCheckBox("Upoznat sa ponudom ");
    }
       
    private void pokreniMenadzeraRasporedaKomponeti(){
        setLayout(new GridBagLayout());
        setAlignmentX(Component.LEFT_ALIGNMENT);
    }
    private void postaviJCheckBox(){ 
        jCheckBox.setMinimumSize(new Dimension(150, 15));
        jCheckBox.setPreferredSize(new Dimension(150, 50));
        jCheckBox.setMaximumSize(new Dimension(150, 15));
        add(jCheckBox);        
    }
}
