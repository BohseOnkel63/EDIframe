package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1230  Allowance or charge number  an..35
 * Number assigned by a party referencing an allowance, promotion, deal or charge.
 */
public class E1230 extends Element {

    public E1230() {
        this(null);
    }

    public E1230(String Content) {
        super("1230", "Allowance or charge number", "an..35", "Number assigned by a party referencing an allowance, promotion, deal or charge.", "");
        this.setContent(Content);
    }
}

