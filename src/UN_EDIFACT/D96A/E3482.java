package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3482  Religion  an..35
 * To specify the religion of a person.
 */
public class E3482 extends Element {

    public E3482() {
        this(null);
    }

    public E3482(String Content) {
        super("3482", "Religion", "an..35", "To specify the religion of a person.", "");
        this.setContent(Content);
    }
}

