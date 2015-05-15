package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0525  Cryptographic mode of operation, coded  an..3
 * Specification of the mode of operation used for the algorithm.
 */
public class UN_E0525 extends Element {

    public UN_E0525() {
        this(null);
    }

    public UN_E0525(String Content) {
        super("0525", "Cryptographic mode of operation, coded", "an..3", "Specification of the mode of operation used for the algorithm.");
        this.setContent(Content);
    }
}

