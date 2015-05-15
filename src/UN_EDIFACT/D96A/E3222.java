package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3222  Related place/location one  an..70
 * Specification of the first related place/location by name.
 */
public class E3222 extends Element {

    public E3222() {
        this(null);
    }

    public E3222(String Content) {
        super("3222", "Related place/location one", "an..70", "Specification of the first related place/location by name.", "");
        this.setContent(Content);
    }
}

