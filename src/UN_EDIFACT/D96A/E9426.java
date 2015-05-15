package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9426  Code value  an..35
 * Value of the code.
 */
public class E9426 extends Element {

    public E9426() {
        this(null);
    }

    public E9426(String Content) {
        super("9426", "Code value", "an..35", "Value of the code.", "");
        this.setContent(Content);
    }
}

