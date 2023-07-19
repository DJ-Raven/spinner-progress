package raven.spinner;

import javax.swing.JProgressBar;

/**
 *
 * @author Raven
 */
public class SpinnerProgress extends JProgressBar {

    public SpinnerProgress() {
        init();
    }

    @Override
    public void updateUI() {
        setUI(new SpinnerProgressUI());
    }

    private void init() {
        setUI(new SpinnerProgressUI());
    }
}
