package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8028  Conveyance reference number  an..17
 * Unique reference given by the carrier to a certain journey or departure of a means of transport (generic term).
 */
public class E8028 extends Element {

    public E8028() {
        this(null);
    }

    public E8028(String Content) {
        super("8028", "Conveyance reference number", "an..17", "Unique reference given by the carrier to a certain journey or departure of a means of transport (generic term).", "");
        this.setContent(Content);
    }
}

