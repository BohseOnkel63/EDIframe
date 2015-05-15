package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3413  Department or employee identification  an..17
 * Internal identification code.
 */
public class E3413 extends Element {

    public E3413() {
        this(null);
    }

    public E3413(String Content) {
        super("3413", "Department or employee identification", "an..17", "Internal identification code.", "Code specified by organisation concerned.");
        this.setContent(Content);
    }
}

