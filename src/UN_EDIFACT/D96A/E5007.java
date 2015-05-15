package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5007  Monetary function, coded  an..3
 * To specify the function of a related monetary amount.
 */
public class E5007 extends Element {

    public E5007() {
        this(null);
    }

    public E5007(String Content) {
        super("5007", "Monetary function, coded", "an..3", "To specify the function of a related monetary amount.", "");
        this.setContent(Content);
    }
}

