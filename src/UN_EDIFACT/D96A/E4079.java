package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4079  Handling instructions, coded  an..3
 * Identification of the instructions on how specified goods, packages or containers should be handled.
 */
public class E4079 extends Element {

    public E4079() {
        this(null);
    }

    public E4079(String Content) {
        super("4079", "Handling instructions, coded", "an..3", "Identification of the instructions on how specified goods, packages or containers should be handled.", "User or association defined code.  May be used in combination with 1131/3055.  See also UNTDED 5.9 p.2 CIMP.");
        this.setContent(Content);
    }
}

