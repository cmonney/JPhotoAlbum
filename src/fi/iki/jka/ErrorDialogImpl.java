package fi.iki.jka;

import javax.swing.*;

public class ErrorDialogImpl implements ErrorDisplay {
    public void errorMessage(JPhotoFrame photoFrame) {
        JOptionPane.showMessageDialog(photoFrame, "No photos to show!",
               photoFrame.APP_NAME, JOptionPane.ERROR_MESSAGE);
    }
}
