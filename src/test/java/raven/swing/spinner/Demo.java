package raven.swing.spinner;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.formdev.flatlaf.util.UIScale;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame {

    public Demo() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(UIScale.scale(new Dimension(500, 300)));
        setLocationRelativeTo(null);
        JPanel panel = new JPanel(new MigLayout("fill, al center center","[center]"));
        add(panel);
        SpinnerProgress sp1 = new SpinnerProgress(new FlatSVGIcon("raven/swing/spinner/save.svg"));
        sp1.setHorizontalTextPosition(SwingConstants.CENTER);
        sp1.setVerticalTextPosition(SwingConstants.BOTTOM);
        sp1.setValue(70);
        sp1.setStringPainted(true);
        panel.add(sp1);
        add(panel);

        JButton button = new JButton("Test Action");
        button.addActionListener(e -> {
            boolean act = !sp1.isIndeterminate();
            sp1.setIndeterminate(act);
        });
        panel.add(button,"dock south,gap 5 5 5 5");
    }

    public static void main(String[] args) {
        FlatRobotoFont.install();
        FlatMacLightLaf.setup();
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        UIManager.put("ProgressBar.cycleTime", 1000);
        EventQueue.invokeLater(() -> new Demo().setVisible(true));
    }
}
