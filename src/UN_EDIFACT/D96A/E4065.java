package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4065  Contract and carriage condition, coded  an..3
 * Code to identify the conditions of contract and carriage.
 */
public class E4065 extends Element {

    public E4065() {
        this(null);
    }

    public E4065(String Content) {
        super("4065", "Contract and carriage condition, coded", "an..3", "Code to identify the conditions of contract and carriage.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

