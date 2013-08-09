package blackjack_test.gui;

import java.awt.event.*;
import javax.swing.*;

public class ChoicePanel extends JPanel {
        
        private JButton hit = new JButton("Hit");
        private JButton stand = new JButton("Stand");
        private JButton dbl = new JButton("Double");    
        private JButton split = new JButton("Split");
        private JButton surrender = new JButton("Surrender");

        public ChoicePanel() {
                super();        
                setOpaque(false); 
                add(hit);
                add(stand);
                add(dbl);
                add(split);
//                disableSplit();
                add(surrender);
        }
        

        public void enableHit() {
                hit.setEnabled(true);
        }

        public void enableStand() {
                stand.setEnabled(true);
        }

        public void enableDouble() {
                dbl.setEnabled(true);
        }

        public void enableSplit() {
                split.setEnabled(true);
        }

        public void enableSurrender() {
                surrender.setEnabled(true);
        }
        
        public void disableHit() {
                hit.setEnabled(false);
        }
        
        public void disableStand() {
                stand.setEnabled(false);
        }

        public void disableDouble() {
                dbl.setEnabled(false);
        }
        
        public void disableSplit() {
                split.setEnabled(false);
        }
        
        public void disableSurrender() {
                surrender.setEnabled(false);
        }

        public void addListener(ActionListener a) {
                hit.addActionListener(a);
                stand.addActionListener(a);
                dbl.addActionListener(a);
                split.addActionListener(a);
                surrender.addActionListener(a);
        }
}
