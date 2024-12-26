package ar.edu.unq;

import org.junit.Test;

public class NotifierTest {

    /**
     * I don't want sent emails form this class, I just want test Notifier
     */
    @Test
    public void notifier1____() throws Exception {
        Notifier_CoupledByStaticMethod notifier = new Notifier_CoupledByStaticMethod();

        // How do you change "mailSender" to test it?

    }

    /**
     * I don't want sent emails form this class, I just want test Notifier
     */
    @Test
    public void notifier2____() throws Exception {
        Notifier_CoupledByNew notifier = new Notifier_CoupledByNew();
      
        // How do you change "mailSender" to test it?
      
    }

    /**
     * I don't want sent emails form this class, I just want test Notifier
     */
    @Test
    public void notifier3____() throws Exception {
        MailSender mailSenderMock = new MailSenderMock();

        Notifier notifier = new Notifier(mailSenderMock);
        // How do you change "mailSender" to test it?


    }

}

class MailSenderMock implements MailSender {

    @Override
    public void send(final Mail mail) {
        // Nothing
    }

}
