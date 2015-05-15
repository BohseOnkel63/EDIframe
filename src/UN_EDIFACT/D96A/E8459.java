package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8459  Excess transportation responsibility, coded  an..3
 * Indication of responsibility for excess transportation.
 */
public class E8459 extends Element {

    public E8459() {
        this(null);
    }

    public E8459(String Content) {
        super("8459", "Excess transportation responsibility, coded", "an..3", "Indication of responsibility for excess transportation.", "");
        this.setContent(Content);
    }
}

