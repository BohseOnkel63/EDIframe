package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1510  Computer environment  an..35
 * To define the product name of the specified computer environment part.
 */
public class E1510 extends Element {

    public E1510() {
        this(null);
    }

    public E1510(String Content) {
        super("1510", "Computer environment", "an..35", "To define the product name of the specified computer environment part.", "");
        this.setContent(Content);
    }
}

