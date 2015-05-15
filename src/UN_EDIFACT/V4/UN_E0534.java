package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0534  Security reference number  an..14
 * Unique reference number assigned by the security originator to a pair of security header and security trailer groups.
 */
public class UN_E0534 extends Element {

    public UN_E0534() {
        this(null);
    }

    public UN_E0534(String Content) {
        super("0534", "Security reference number", "an..14", "Unique reference number assigned by the security originator to a pair of security header and security trailer groups.");
        this.setContent(Content);
    }
}

