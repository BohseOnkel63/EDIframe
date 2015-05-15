package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3164  City name  an..35
 * Name of a city (a town, a village) for addressing purposes.
 */
public class E3164 extends Element {

    public E3164() {
        this(null);
    }

    public E3164(String Content) {
        super("3164", "City name", "an..35", "Name of a city (a town, a village) for addressing purposes.", "");
        this.setContent(Content);
    }
}

