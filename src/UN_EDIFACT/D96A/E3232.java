package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3232  Related place/location two  an..70
 * Specification of a second related place/location by name.
 */
public class E3232 extends Element {

    public E3232() {
        this(null);
    }

    public E3232(String Content) {
        super("3232", "Related place/location two", "an..70", "Specification of a second related place/location by name.", "");
        this.setContent(Content);
    }
}

