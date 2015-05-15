package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6353  Number of units qualifier  an..3
 * Indication of the objective of number of units information.
 */
public class E6353 extends Element {

    public E6353() {
        this(null);
    }

    public E6353(String Content) {
        super("6353", "Number of units qualifier", "an..3", "Indication of the objective of number of units information.", "");
        this.setContent(Content);
    }
}

