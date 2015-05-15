package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4221  Discrepancy, coded  an..3
 * Code defining the disposition of any difference between the quantity ordered and invoiced, or shipped and invoiced for a line item or transaction.
 */
public class E4221 extends Element {

    public E4221() {
        this(null);
    }

    public E4221(String Content) {
        super("4221", "Discrepancy, coded", "an..3", "Code defining the disposition of any difference between the quantity ordered and invoiced, or shipped and invoiced for a line item or transaction.", "");
        this.setContent(Content);
    }
}

