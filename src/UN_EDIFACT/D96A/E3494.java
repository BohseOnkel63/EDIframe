package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3494  Job title  an..35
 * Description of job classification.
 */
public class E3494 extends Element {

    public E3494() {
        this(null);
    }

    public E3494(String Content) {
        super("3494", "Job title", "an..35", "Description of job classification.", "");
        this.setContent(Content);
    }
}

