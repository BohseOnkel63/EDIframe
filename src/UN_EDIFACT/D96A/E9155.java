package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9155  Simple data element length type, coded  an..3
 * Code identifying the length type of a simple data element.
 */
public class E9155 extends Element {

    public E9155() {
        this(null);
    }

    public E9155(String Content) {
        super("9155", "Simple data element length type, coded", "an..3", "Code identifying the length type of a simple data element.", "");
        this.setContent(Content);
    }
}

