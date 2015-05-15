package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4513  Maintenance operation, coded  an..3
 * To indicate the type of data maintenance operation for an object, such as add, delete, replace.
 */
public class E4513 extends Element {

    public E4513() {
        this(null);
    }

    public E4513(String Content) {
        super("4513", "Maintenance operation, coded", "an..3", "To indicate the type of data maintenance operation for an object, such as add, delete, replace.", "");
        this.setContent(Content);
    }
}

