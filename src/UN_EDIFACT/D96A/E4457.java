package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4457  Product/service substitution, coded  an..3
 * Code indicating product or service substitution conditions.
 */
public class E4457 extends Element {

    public E4457() {
        this(null);
    }

    public E4457(String Content) {
        super("4457", "Product/service substitution, coded", "an..3", "Code indicating product or service substitution conditions.", "");
        this.setContent(Content);
    }
}

