package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7161  Special services, coded  an..3
 * Code identifying a special service.
 */
public class E7161 extends Element {

    public E7161() {
        this(null);
    }

    public E7161(String Content) {
        super("7161", "Special services, coded", "an..3", "Code identifying a special service.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

