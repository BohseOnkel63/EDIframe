package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3403  Name type, coded  an..3
 * Code for type of name such as official name, alias.
 */
public class E3403 extends Element {

    public E3403() {
        this(null);
    }

    public E3403(String Content) {
        super("3403", "Name type, coded", "an..3", "Code for type of name such as official name, alias.", "");
        this.setContent(Content);
    }
}

