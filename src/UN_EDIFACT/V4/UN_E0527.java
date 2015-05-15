package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0527  Algorithm, coded  an..3
 * Identification of the algorithm.
 */
public class UN_E0527 extends Element {

    public UN_E0527() {
        this(null);
    }

    public UN_E0527(String Content) {
        super("0527", "Algorithm, coded", "an..3", "Identification of the algorithm.");
        this.setContent(Content);
    }
}

