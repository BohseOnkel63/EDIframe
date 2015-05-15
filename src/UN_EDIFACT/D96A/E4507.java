package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4507  Credit cover response, coded  an..3
 * Reply to a request for credit cover.
 */
public class E4507 extends Element {

    public E4507() {
        this(null);
    }

    public E4507(String Content) {
        super("4507", "Credit cover response, coded", "an..3", "Reply to a request for credit cover.", "");
        this.setContent(Content);
    }
}

