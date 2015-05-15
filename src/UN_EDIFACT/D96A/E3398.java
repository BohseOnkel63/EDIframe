package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3398  Name component  an..70
 * Part of party name such as family name or given name.
 */
public class E3398 extends Element {

    public E3398() {
        this(null);
    }

    public E3398(String Content) {
        super("3398", "Name component", "an..70", "Part of party name such as family name or given name.", "");
        this.setContent(Content);
    }
}

