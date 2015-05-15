package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3310  Person inherited characteristic  an..70
 * To specify a person inherited characteristic as free text.
 */
public class E3310 extends Element {

    public E3310() {
        this(null);
    }

    public E3310(String Content) {
        super("3310", "Person inherited characteristic", "an..70", "To specify a person inherited characteristic as free text.", "");
        this.setContent(Content);
    }
}

