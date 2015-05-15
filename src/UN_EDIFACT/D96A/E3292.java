package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3292  Nationality  a..35
 * Name of country of which an entity is the subject.
 */
public class E3292 extends Element {

    public E3292() {
        this(null);
    }

    public E3292(String Content) {
        super("3292", "Nationality", "a..35", "Name of country of which an entity is the subject.", "");
        this.setContent(Content);
    }
}

