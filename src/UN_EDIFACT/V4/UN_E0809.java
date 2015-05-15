package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0809  Object type attribute identification  an..256
 * Coded identification of the attribute applying to the object type.
 */
public class UN_E0809 extends Element {

    public UN_E0809() {
        this(null);
    }

    public UN_E0809(String Content) {
        super("0809", "Object type attribute identification", "an..256", "Coded identification of the attribute applying to the object type.");
        this.setContent(Content);
    }
}

