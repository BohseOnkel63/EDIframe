package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8213  Id. of means of transport identification  an..9
 * Identification of the means of transport by name or number.
 */
public class E8213 extends Element {

    public E8213() {
        this(null);
    }

    public E8213(String Content) {
        super("8213", "Id. of means of transport identification", "an..9", "Identification of the means of transport by name or number.", "Use relevant code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

