package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7075  Packaging level, coded  an..3
 * Indication of level of packaging specified.
 */
public class E7075 extends Element {

    public E7075() {
        this(null);
    }

    public E7075(String Content) {
        super("7075", "Packaging level, coded", "an..3", "Indication of level of packaging specified.", "");
        this.setContent(Content);
    }
}

