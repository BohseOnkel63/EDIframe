package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0087  Anti-collision segment group identification  an..4
 * To identify uniquely an anti-collision segment group in a message.
 */
public class UN_E0087 extends Element {

    public UN_E0087() {
        this(null);
    }

    public UN_E0087(String Content) {
        super("0087", "Anti-collision segment group identification", "an..4", "To identify uniquely an anti-collision segment group in a message.");
        this.setContent(Content);
    }
}

