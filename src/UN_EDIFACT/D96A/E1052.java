package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1052  Message item number  an..35
 * The referenced number allocated to an identifiable item in a message. eg Customs item or invoice item.
 */
public class E1052 extends Element {

    public E1052() {
        this(null);
    }

    public E1052(String Content) {
        super("1052", "Message item number", "an..35", "The referenced number allocated to an identifiable item in a message. eg Customs item or invoice item.", "");
        this.setContent(Content);
    }
}

