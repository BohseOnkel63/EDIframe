package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8410  MFAG  an..4
 * Medical first aid guide.
 */
public class E8410 extends Element {

    public E8410() {
        this(null);
    }

    public E8410(String Content) {
        super("8410", "MFAG", "an..4", "Medical first aid guide.", "");
        this.setContent(Content);
    }
}

