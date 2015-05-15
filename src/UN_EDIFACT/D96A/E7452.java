package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7452  Membership status  an..35
 * Description of membership status.
 */
public class E7452 extends Element {

    public E7452() {
        this(null);
    }

    public E7452(String Content) {
        super("7452", "Membership status", "an..35", "Description of membership status.", "");
        this.setContent(Content);
    }
}

