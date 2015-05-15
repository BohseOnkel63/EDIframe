package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9008  Occupation  an..35
 * Description of an occupation.
 */
public class E9008 extends Element {

    public E9008() {
        this(null);
    }

    public E9008(String Content) {
        super("9008", "Occupation", "an..35", "Description of an occupation.", "");
        this.setContent(Content);
    }
}

