package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9411  Government involvement, coded  an..3
 * Indication of requirement and status of government involvement.
 */
public class E9411 extends Element {

    public E9411() {
        this(null);
    }

    public E9411(String Content) {
        super("9411", "Government involvement, coded", "an..3", "Indication of requirement and status of government involvement.", "");
        this.setContent(Content);
    }
}

