package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7453  Membership status, coded  an..3
 * Identification of the membership status.
 */
public class E7453 extends Element {

    public E7453() {
        this(null);
    }

    public E7453(String Content) {
        super("7453", "Membership status, coded", "an..3", "Identification of the membership status.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

