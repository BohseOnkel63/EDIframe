package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7431  Agreement type qualifier  an..3
 * Indication of the type of agreement.
 */
public class E7431 extends Element {

    public E7431() {
        this(null);
    }

    public E7431(String Content) {
        super("7431", "Agreement type qualifier", "an..3", "Indication of the type of agreement.", "");
        this.setContent(Content);
    }
}

