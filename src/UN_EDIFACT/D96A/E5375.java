package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5375  Price type, coded  an..3
 * Code identifying the type of price of an item.
 */
public class E5375 extends Element {

    public E5375() {
        this(null);
    }

    public E5375(String Content) {
        super("5375", "Price type, coded", "an..3", "Code identifying the type of price of an item.", "");
        this.setContent(Content);
    }
}

