package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8364  EMS number  an..6
 * Emergency procedures for ships carrying dangerous goods.
 */
public class E8364 extends Element {

    public E8364() {
        this(null);
    }

    public E8364(String Content) {
        super("8364", "EMS number", "an..6", "Emergency procedures for ships carrying dangerous goods.", "");
        this.setContent(Content);
    }
}

