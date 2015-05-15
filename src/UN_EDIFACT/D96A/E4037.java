package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4037  Priority, coded  an..3
 * To indicate a priority in coded form.
 */
public class E4037 extends Element {

    public E4037() {
        this(null);
    }

    public E4037(String Content) {
        super("4037", "Priority, coded", "an..3", "To indicate a priority in coded form.", "");
        this.setContent(Content);
    }
}

