package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9019  Attribute, coded  an..3
 * Identification of an attribute.
 */
public class E9019 extends Element {

    public E9019() {
        this(null);
    }

    public E9019(String Content) {
        super("9019", "Attribute, coded", "an..3", "Identification of an attribute.", "Must be from an external code set, such as a user or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

