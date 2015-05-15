package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4233  Marking instructions, coded  an..3
 * Code indicating instructions on how specified packages or physical units should be marked.
 */
public class E4233 extends Element {

    public E4233() {
        this(null);
    }

    public E4233(String Content) {
        super("4233", "Marking instructions, coded", "an..3", "Code indicating instructions on how specified packages or physical units should be marked.", "");
        this.setContent(Content);
    }
}

