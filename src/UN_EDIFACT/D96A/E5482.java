package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5482  Percentage  n..10
 * Value expressed as a percentage of a specified amount.
 */
public class E5482 extends Element {

    public E5482() {
        this(null);
    }

    public E5482(String Content) {
        super("5482", "Percentage", "n..10", "Value expressed as a percentage of a specified amount.", "");
        this.setContent(Content);
    }
}

