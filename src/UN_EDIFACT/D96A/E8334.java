package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8334  Movement type  an..35
 * Description of the type of movement.
 */
public class E8334 extends Element {

    public E8334() {
        this(null);
    }

    public E8334(String Content) {
        super("8334", "Movement type", "an..35", "Description of the type of movement.", "");
        this.setContent(Content);
    }
}

