package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4405  Status, coded  an..3
 * Provides information regarding a status.
 */
public class E4405 extends Element {

    public E4405() {
        this(null);
    }

    public E4405(String Content) {
        super("4405", "Status, coded", "an..3", "Provides information regarding a status.", "");
        this.setContent(Content);
    }
}

