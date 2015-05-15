package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1502  Data format  an..35
 * To describe a data format in free form.
 */
public class E1502 extends Element {

    public E1502() {
        this(null);
    }

    public E1502(String Content) {
        super("1502", "Data format", "an..35", "To describe a data format in free form.", "");
        this.setContent(Content);
    }
}

