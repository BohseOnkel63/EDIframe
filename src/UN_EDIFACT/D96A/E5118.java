package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5118  Price  n..15
 * The monetary value associated with a purchase or sale of an article, product or service.
 */
public class E5118 extends Element {

    public E5118() {
        this(null);
    }

    public E5118(String Content) {
        super("5118", "Price", "n..15", "The monetary value associated with a purchase or sale of an article, product or service.", "");
        this.setContent(Content);
    }
}

