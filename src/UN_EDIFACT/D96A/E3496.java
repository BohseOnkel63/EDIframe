package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3496  Sales channel identifier  an..17
 * Code identifying a sales channel for marketing information.
 */
public class E3496 extends Element {

    public E3496() {
        this(null);
    }

    public E3496(String Content) {
        super("3496", "Sales channel identifier", "an..17", "Code identifying a sales channel for marketing information.", "");
        this.setContent(Content);
    }
}

