package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4509  Credit cover reason, coded  an..3
 * Reason of reply to a request for credit cover.
 */
public class E4509 extends Element {

    public E4509() {
        this(null);
    }

    public E4509(String Content) {
        super("4509", "Credit cover reason, coded", "an..3", "Reason of reply to a request for credit cover.", "");
        this.setContent(Content);
    }
}

