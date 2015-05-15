package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7011  Article availability, coded  an..3
 * Code specifying the production status of an item.
 */
public class E7011 extends Element {

    public E7011() {
        this(null);
    }

    public E7011(String Content) {
        super("7011", "Article availability, coded", "an..3", "Code specifying the production status of an item.", "");
        this.setContent(Content);
    }
}

