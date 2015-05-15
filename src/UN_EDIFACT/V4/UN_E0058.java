package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0058  Application password  an..14
 * Password to the recipient's division, department or sectional application system/process.
 */
public class UN_E0058 extends Element {

    public UN_E0058() {
        this(null);
    }

    public UN_E0058(String Content) {
        super("0058", "Application password", "an..14", "Password to the recipient's division, department or sectional application system/process.");
        this.setContent(Content);
    }
}

