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
        JPanel panel = new JPanel(new MigLayout("fill, al center center", "[center]"));
        add(panel);
        SpinnerProgress spinner = new SpinnerProgress(new FlatSVGIcon("raven/swing/spinner/save.svg"));
        spinner.setHorizontalTextPosition(SwingConstants.CENTER);
        spinner.setVerticalTextPosition(SwingConstants.BOTTOM);
        spinner.setValue(70);
        spinner.setStringPainted(true);
        panel.add(spinner);
        add(panel);

        JButton button = new JButton("Test Action");
        button.addActionListener(e -> {
            boolean act = !spinner.isIndeterminate();
            spinner.setIndeterminate(act);
        });
        panel.add(button, "dock south,gap 5 5 5 5");
    }

    public static void main(String[] args) {
        FlatRobotoFont.install();
        FlatMacLightLaf.setup();
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        UIManager.put("ProgressBar.cycleTime", 1000);
        UIManager.put("ProgressBar.repaintInterval", 15);

        EventQueue.invokeLater(() -> new Demo().setVisible(true));
    }
}
