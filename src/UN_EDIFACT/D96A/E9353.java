package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9353  Government procedure, coded  an..3
 * Code identifying the treatment applied by the government to goods which are subject to a control.
 */
public class E9353 extends Element {

    public E9353() {
        this(null);
    }

    public E9353(String Content) {
        super("9353", "Government procedure, coded", "an..3", "Code identifying the treatment applied by the government to goods which are subject to a control.", "");
        this.setContent(Content);
    }
}

