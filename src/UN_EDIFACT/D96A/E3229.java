package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3229  Country sub-entity identification  an..9
 * Identification of the name of sub-entities (state, province) defined by appropriate governmental agencies.
 */
public class E3229 extends Element {

    public E3229() {
        this(null);
    }

    public E3229(String Content) {
        super("3229", "Country sub-entity identification", "an..9", "Identification of the name of sub-entities (state, province) defined by appropriate governmental agencies.", "Use code defined by appropriate national authority.");
        this.setContent(Content);
    }
}

