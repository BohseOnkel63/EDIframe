package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7233  Packaging related information, coded  an..3
 * Code giving packaging, handling and marking related information.
 */
public class E7233 extends Element {

    public E7233() {
        this(null);
    }

    public E7233(String Content) {
        super("7233", "Packaging related information, coded", "an..3", "Code giving packaging, handling and marking related information.", "");
        this.setContent(Content);
    }
}

