package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 2152  Number of periods  n..3
 * Number of periods of the type indicated in data element 2151 Type of period, coded.
 */
public class E2152 extends Element {

    public E2152() {
        this(null);
    }

    public E2152(String Content) {
        super("2152", "Number of periods", "n..3", "Number of periods of the type indicated in data element 2151 Type of period, coded.", "");
        this.setContent(Content);
    }
}

