package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0808  Object type attribute  an..256
 * The attribute applying to the object type.
 */
public class UN_E0808 extends Element {

    public UN_E0808() {
        this(null);
    }

    public UN_E0808(String Content) {
        super("0808", "Object type attribute", "an..256", "The attribute applying to the object type.");
        this.setContent(Content);
    }
}

