package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7045  Sample description, coded  an..3
 * Code describing the state of the specimen.
 */
public class E7045 extends Element {

    public E7045() {
        this(null);
    }

    public E7045(String Content) {
        super("7045", "Sample description, coded", "an..3", "Code describing the state of the specimen.", "");
        this.setContent(Content);
    }
}

