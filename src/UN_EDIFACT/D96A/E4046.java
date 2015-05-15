package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4046  Safety section  n..2
 * To identify the safety section number.
 */
public class E4046 extends Element {

    public E4046() {
        this(null);
    }

    public E4046(String Content) {
        super("4046", "Safety section", "n..2", "To identify the safety section number.", "");
        this.setContent(Content);
    }
}

