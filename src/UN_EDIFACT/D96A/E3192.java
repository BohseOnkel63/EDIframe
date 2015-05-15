package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3192  Account holder name  an..35
 * Name of the holder of the account.
 */
public class E3192 extends Element {

    public E3192() {
        this(null);
    }

    public E3192(String Content) {
        super("3192", "Account holder name", "an..35", "Name of the holder of the account.", "");
        this.setContent(Content);
    }
}

