package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0586  Security party name  an..35
 * Name of the security party.
 */
public class UN_E0586 extends Element {

    public UN_E0586() {
        this(null);
    }

    public UN_E0586(String Content) {
        super("0586", "Security party name", "an..35", "Name of the security party.");
        this.setContent(Content);
    }
}

