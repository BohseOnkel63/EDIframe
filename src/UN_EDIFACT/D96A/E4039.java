package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4039  Additional safety information, coded  an..3
 * Element to identify the additional safety information in coded form.
 */
public class E4039 extends Element {

    public E4039() {
        this(null);
    }

    public E4039(String Content) {
        super("4039", "Additional safety information, coded", "an..3", "Element to identify the additional safety information in coded form.", "");
        this.setContent(Content);
    }
}

