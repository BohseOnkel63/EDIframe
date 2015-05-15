package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9421  Stages qualifier  an..3
 * Code identifying the kind of stage in a process.
 */
public class E9421 extends Element {

    public E9421() {
        this(null);
    }

    public E9421(String Content) {
        super("9421", "Stages qualifier", "an..3", "Code identifying the kind of stage in a process.", "");
        this.setContent(Content);
    }
}

