package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1058  Release  an..9
 * To specify the release number or release name of an object.
 */
public class E1058 extends Element {

    public E1058() {
        this(null);
    }

    public E1058(String Content) {
        super("1058", "Release", "an..9", "To specify the release number or release name of an object.", "");
        this.setContent(Content);
    }
}

