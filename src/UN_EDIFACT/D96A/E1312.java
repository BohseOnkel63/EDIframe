package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1312  Consignment load sequence number  n..4
 * To indicate the sequence of loading in which the consignments are loaded in a piece of equipment or in a means of transport (e.g. truck).
 */
public class E1312 extends Element {

    public E1312() {
        this(null);
    }

    public E1312(String Content) {
        super("1312", "Consignment load sequence number", "n..4", "To indicate the sequence of loading in which the consignments are loaded in a piece of equipment or in a means of transport (e.g. truck).", "");
        this.setContent(Content);
    }
}

