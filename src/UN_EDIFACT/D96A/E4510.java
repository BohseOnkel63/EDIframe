package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4510  Requested information  an..35
 * To specify the information requested in a responding message in a clear text form.
 */
public class E4510 extends Element {

    public E4510() {
        this(null);
    }

    public E4510(String Content) {
        super("4510", "Requested information", "an..35", "To specify the information requested in a responding message in a clear text form.", "");
        this.setContent(Content);
    }
}

