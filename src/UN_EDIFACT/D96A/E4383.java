package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4383  Bank operation, coded  an..3
 * Describe the method to transfer funds in coded form.
 */
public class E4383 extends Element {

    public E4383() {
        this(null);
    }

    public E4383(String Content) {
        super("4383", "Bank operation, coded", "an..3", "Describe the method to transfer funds in coded form.", "");
        this.setContent(Content);
    }
}

