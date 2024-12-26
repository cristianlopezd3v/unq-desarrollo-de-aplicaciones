package ar.edu.unq;

public class Notifier_CoupledByStaticMethod {

    private final MailSender mailSender;

    public Notifier_CoupledByStaticMethod() {
        mailSender = MyMailSender.getInstance();
        // o por ejemplo
        // mailSender = ApplicationContext.mailSender();
    }

}
