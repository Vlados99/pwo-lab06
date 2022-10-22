package pwo.app;

import pwo.utils.SequenceTools;

/**
 * Klasa rozbudowująca działanie funkcji {@link pwo.app.SeqToFileApp}. Klasa
 * dodaje możliwość wypisania wyników na ekran konsoli.
 *
 * @author Vladyslav Veshnevskyi
 * @version 1.0.0
 */
public class SeqToOutApp extends SeqToFileApp {

    /**
     * Metoda pobierająca argumenty z super klasy, sprawdzająca czy są dane i
     * czy oni są prawidłowe i zwracająca true lub false
     *
     * @param args
     * @return true lub false
     */
    @Override
    protected boolean getArgs(String[] args) {
        if (super.getArgs(args)) {
            return true;
        }

        return seqType != null && from >= 0 && to >= 0;
    }

    /**
     * Metoda służąca do wykonania docelowej pracy
     *
     * @return true
     */
    @Override
    protected boolean wirteSeq() {
        System.out.println(SequenceTools.getTermsAsColumn(seqType.getGenerator(), from, to));
        return true;
    }

    /**
     * Metoda do uruchomienia obiektu aplikacji
     *
     * @param args
     */
    @Override
    public void run(String[] args) {
        System.out.println("Sequence to terminal CLI app");

        if (!getArgs(args)) {
            System.out.println("!Illegal arguments\n"
                    + "Legal usage: seqName from to");
            return;
        }

        wirteSeq();
    }

}
