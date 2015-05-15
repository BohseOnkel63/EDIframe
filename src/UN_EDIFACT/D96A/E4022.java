package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4022  Business description  an..70
 * Description of a business.
 */
public class E4022 extends Element {

    public E4022() {
        this(null);
    }

    public E4022(String Content) {
        super("4022", "Business description", "an..70", "Description of a business.", "");
        this.setContent(Content);
    }
}

