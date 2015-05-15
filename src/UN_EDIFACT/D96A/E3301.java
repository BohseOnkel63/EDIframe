package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3301  Party enacting instruction identification  an..17
 * Party responsible for carrying out the instruction.
 */
public class E3301 extends Element {

    public E3301() {
        this(null);
    }

    public E3301(String Content) {
        super("3301", "Party enacting instruction identification", "an..17", "Party responsible for carrying out the instruction.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

