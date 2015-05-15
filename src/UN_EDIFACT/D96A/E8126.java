package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8126  Trem card number  an..10
 * The identification of a transport emergency card giving advice for emergency actions.
 */
public class E8126 extends Element {

    public E8126() {
        this(null);
    }

    public E8126(String Content) {
        super("8126", "Trem card number", "an..10", "The identification of a transport emergency card giving advice for emergency actions.", "");
        this.setContent(Content);
    }
}

