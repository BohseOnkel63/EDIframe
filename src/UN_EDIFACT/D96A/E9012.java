package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9012  Status reason  an..35
 * Provides the reason behind a status event.
 */
public class E9012 extends Element {

    public E9012() {
        this(null);
    }

    public E9012(String Content) {
        super("9012", "Status reason", "an..35", "Provides the reason behind a status event.", "");
        this.setContent(Content);
    }
}

