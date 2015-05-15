package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3293  Nationality, coded  an..3
 * Code for country of which an entity is the subject.
 */
public class E3293 extends Element {

    public E3293() {
        this(null);
    }

    public E3293(String Content) {
        super("3293", "Nationality, coded", "an..3", "Code for country of which an entity is the subject.", "");
        this.setContent(Content);
    }
}

