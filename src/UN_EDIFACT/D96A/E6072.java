package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6072  Frequency value  n..9
 * A value indicating a repetitive occurrence.
 */
public class E6072 extends Element {

    public E6072() {
        this(null);
    }

    public E6072(String Content) {
        super("6072", "Frequency value", "n..9", "A value indicating a repetitive occurrence.", "");
        this.setContent(Content);
    }
}

