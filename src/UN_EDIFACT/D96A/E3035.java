package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3035  Party qualifier  an..3
 * Code giving specific meaning to a party.
 */
public class E3035 extends Element {

    public E3035() {
        this(null);
    }

    public E3035(String Content) {
        super("3035", "Party qualifier", "an..3", "Code giving specific meaning to a party.", "");
        this.setContent(Content);
    }
}

