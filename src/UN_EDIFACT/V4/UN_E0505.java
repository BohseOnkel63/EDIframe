package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0505  Filter function, coded  an..3
 * Identification of the filtering function used to reversibly map any bit pattern on to a restricted character set.
 */
public class UN_E0505 extends Element {

    public UN_E0505() {
        this(null);
    }

    public UN_E0505(String Content) {
        super("0505", "Filter function, coded", "an..3", "Identification of the filtering function used to reversibly map any bit pattern on to a restricted character set.");
        this.setContent(Content);
    }
}

