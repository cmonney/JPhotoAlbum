package fi.iki.jka;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class JPhotoFrameTest {
    @Test
    public void testActionPerformed() throws Exception {
        JPhotoCollection photoCollection = new JPhotoCollection();
        JPhotoFrame photoFrame = new JPhotoFrame();
        FakeErrorDisplay errorDisplay = new FakeErrorDisplay();
        photoFrame.showSlideShow(photoCollection, errorDisplay);

        assertTrue(errorDisplay.isErrorMessage());
    }
}
