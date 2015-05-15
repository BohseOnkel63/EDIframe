package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9013  Status reason, coded  an..3
 * Code identifying the reason behind a status event.
 */
public class E9013 extends Element {

    public E9013() {
        this(null);
    }

    public E9013(String Content) {
        super("9013", "Status reason, coded", "an..3", "Code identifying the reason behind a status event.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

