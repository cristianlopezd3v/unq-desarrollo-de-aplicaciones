package cleancode.example.examples;

import cleancode.example.examples.ext.Cryptographer;
import cleancode.example.examples.ext.Phrase;
import cleancode.example.examples.ext.Session;
import cleancode.example.examples.ext.User;

/**
 * @author diego
 * 
 */
public class SideEffectsExample {

    private Cryptographer cryptographer;

    public boolean checkPassword(final User user, final String password) {
        Phrase userCodedPhrase = user.getPhraseEncodedByPassword();

        Phrase phrase = cryptographer.decryp(password);

        if (phrase.sameAs(userCodedPhrase)) {
            Session.initialize();
            return true;
        }

        return false;
    }

}
