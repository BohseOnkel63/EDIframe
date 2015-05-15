package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3452  Language  an..35
 * Language as text (ISO 639-1988).
 */
public class E3452 extends Element {

    public E3452() {
        this(null);
    }

    public E3452(String Content) {
        super("3452", "Language", "an..35", "Language as text (ISO 639-1988).", "");
        this.setContent(Content);
    }
}

