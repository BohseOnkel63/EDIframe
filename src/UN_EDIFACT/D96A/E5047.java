package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5047  Contribution qualifier  an..3
 * Specification of the meaning of a financial contribution to a scheme or group.
 */
public class E5047 extends Element {

    public E5047() {
        this(null);
    }

    public E5047(String Content) {
        super("5047", "Contribution qualifier", "an..3", "Specification of the meaning of a financial contribution to a scheme or group.", "");
        this.setContent(Content);
    }
}

