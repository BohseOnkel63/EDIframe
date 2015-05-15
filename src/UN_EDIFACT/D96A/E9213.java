package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9213  Type of duty regime, coded  an..3
 * Identification of the statement of the full/preferential regime according to which duty is assessed.
 */
public class E9213 extends Element {

    public E9213() {
        this(null);
    }

    public E9213(String Content) {
        super("9213", "Type of duty regime, coded", "an..3", "Identification of the statement of the full/preferential regime according to which duty is assessed.", "");
        this.setContent(Content);
    }
}

