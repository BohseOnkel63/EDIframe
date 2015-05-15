package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9280  Validation result  an..35
 * The result of the application of an algorithm to the content of data element in a message.
 */
public class E9280 extends Element {

    public E9280() {
        this(null);
    }

    public E9280(String Content) {
        super("9280", "Validation result", "an..35", "The result of the application of an algorithm to the content of data element in a message.", "");
        this.setContent(Content);
    }
}

