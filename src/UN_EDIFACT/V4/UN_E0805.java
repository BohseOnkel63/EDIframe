package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0805  Object type qualifier  an..3
 * Qualifier referring to the type of object.
 */
public class UN_E0805 extends Element {

    public UN_E0805() {
        this(null);
    }

    public UN_E0805(String Content) {
        super("0805", "Object type qualifier", "an..3", "Qualifier referring to the type of object.");
        this.setContent(Content);
    }
}

