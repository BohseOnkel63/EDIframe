package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1496  Goods item number  n..5
 * Serial number differentiating each separate goods item entry of a consignment as contained in one document/declaration.
 */
public class E1496 extends Element {

    public E1496() {
        this(null);
    }

    public E1496(String Content) {
        super("1496", "Goods item number", "n..5", "Serial number differentiating each separate goods item entry of a consignment as contained in one document/declaration.", "");
        this.setContent(Content);
    }
}

