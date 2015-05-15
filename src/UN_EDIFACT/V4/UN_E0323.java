package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0323  Transfer position, coded  a1
 * Indication of the position of a transfer.
 */
public class UN_E0323 extends Element {

    public UN_E0323() {
        this(null);
    }

    public UN_E0323(String Content) {
        super("0323", "Transfer position, coded", "a1", "Indication of the position of a transfer.");
        this.setContent(Content);
    }
}

