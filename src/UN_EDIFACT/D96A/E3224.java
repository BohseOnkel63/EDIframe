package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3224  Place/location  an..70
 * Name of place/location, other than 3164 City name.
 */
public class E3224 extends Element {

    public E3224() {
        this(null);
    }

    public E3224(String Content) {
        super("3224", "Place/location", "an..70", "Name of place/location, other than 3164 City name.", "");
        this.setContent(Content);
    }
}

