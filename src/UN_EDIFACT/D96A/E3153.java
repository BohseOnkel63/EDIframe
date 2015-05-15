package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3153  Communication channel identifier, coded  an..3
 * Code identifying the type of communication channel being used.
 */
public class E3153 extends Element {

    public E3153() {
        this(null);
    }

    public E3153(String Content) {
        super("3153", "Communication channel identifier, coded", "an..3", "Code identifying the type of communication channel being used.", "");
        this.setContent(Content);
    }
}

