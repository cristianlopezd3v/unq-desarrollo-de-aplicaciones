package ar.edu.unq;

public class Notifier_CoupledByNew {

    private final MyMailSender mailSender;

    public Notifier_CoupledByNew() {
        mailSender = new MyMailSender();
    }

}
