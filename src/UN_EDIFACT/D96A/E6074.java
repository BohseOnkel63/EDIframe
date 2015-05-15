package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6074  Confidence limit  n..6
 * A percent value expressing the confidence that a true value falls within a certain confidence interval.
 */
public class E6074 extends Element {

    public E6074() {
        this(null);
    }

    public E6074(String Content) {
        super("6074", "Confidence limit", "n..6", "A percent value expressing the confidence that a true value falls within a certain confidence interval.", "");
        this.setContent(Content);
    }
}

