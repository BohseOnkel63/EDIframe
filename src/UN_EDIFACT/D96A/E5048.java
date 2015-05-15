package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5048  Contribution type  an..35
 * Description of the type of a contribution to a scheme or group.
 */
public class E5048 extends Element {

    public E5048() {
        this(null);
    }

    public E5048(String Content) {
        super("5048", "Contribution type", "an..35", "Description of the type of a contribution to a scheme or group.", "");
        this.setContent(Content);
    }
}

