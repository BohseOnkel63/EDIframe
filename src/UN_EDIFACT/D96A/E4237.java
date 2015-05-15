package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4237  Prepaid/collect indicator, coded  an..3
 * Code indicating whether freight item amount is prepaid or to be collected.
 */
public class E4237 extends Element {

    public E4237() {
        this(null);
    }

    public E4237(String Content) {
        super("4237", "Prepaid/collect indicator, coded", "an..3", "Code indicating whether freight item amount is prepaid or to be collected.", "");
        this.setContent(Content);
    }
}

