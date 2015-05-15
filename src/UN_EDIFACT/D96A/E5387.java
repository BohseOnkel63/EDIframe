package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5387  Price type qualifier  an..3
 * Code identifying pricing specification.
 */
public class E5387 extends Element {

    public E5387() {
        this(null);
    }

    public E5387(String Content) {
        super("5387", "Price type qualifier", "an..3", "Code identifying pricing specification.", "");
        this.setContent(Content);
    }
}

