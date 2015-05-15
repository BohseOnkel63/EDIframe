package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7088  Dangerous goods flashpoint  an..8
 * Lowest temperature, in the case of dangerous goods, at which vapour from an inflammable liquid forms an ignitable mixture with air.
 */
public class E7088 extends Element {

    public E7088() {
        this(null);
    }

    public E7088(String Content) {
        super("7088", "Dangerous goods flashpoint", "an..8", "Lowest temperature, in the case of dangerous goods, at which vapour from an inflammable liquid forms an ignitable mixture with air.", "");
        this.setContent(Content);
    }
}

