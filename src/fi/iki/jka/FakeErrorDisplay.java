package fi.iki.jka;

public class FakeErrorDisplay implements ErrorDisplay {

    public boolean isErrorMessage() {
        return isErrorMessage;
    }

    boolean isErrorMessage;

    public void errorMessage(JPhotoFrame photoFrame) {
        isErrorMessage = true;
    }
}
