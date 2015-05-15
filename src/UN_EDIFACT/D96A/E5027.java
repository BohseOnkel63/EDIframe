package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5027  Index type, coded  an..3
 * To identify the type of index.
 */
public class E5027 extends Element {

    public E5027() {
        this(null);
    }

    public E5027(String Content) {
        super("5027", "Index type, coded", "an..3", "To identify the type of index.", "");
        this.setContent(Content);
    }
}

