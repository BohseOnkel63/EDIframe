package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3228  Country sub-entity  an..35
 * Name of sub-entities (state, province) defined by appropriate governmental agencies.
 */
public class E3228 extends Element {

    public E3228() {
        this(null);
    }

    public E3228(String Content) {
        super("3228", "Country sub-entity", "an..35", "Name of sub-entities (state, province) defined by appropriate governmental agencies.", "");
        this.setContent(Content);
    }
}

