package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8186  Substance identification number, lower part  an4
 * The number for the Orange Placard (lower part) required on the means of transport.
 */
public class E8186 extends Element {

    public E8186() {
        this(null);
    }

    public E8186(String Content) {
        super("8186", "Substance identification number, lower part", "an4", "The number for the Orange Placard (lower part) required on the means of transport.", "");
        this.setContent(Content);
    }
}

