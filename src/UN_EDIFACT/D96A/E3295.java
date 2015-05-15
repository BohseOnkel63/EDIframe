package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3295  Name component original representation, coded  an..3
 * To specify the alphabet originally used to represent the name.
 */
public class E3295 extends Element {

    public E3295() {
        this(null);
    }

    public E3295(String Content) {
        super("3295", "Name component original representation, coded", "an..3", "To specify the alphabet originally used to represent the name.", "");
        this.setContent(Content);
    }
}

