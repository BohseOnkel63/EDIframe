package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3455  Language qualifier  an..3
 * Type of language.
 */
public class E3455 extends Element {

    public E3455() {
        this(null);
    }

    public E3455(String Content) {
        super("3455", "Language qualifier", "an..3", "Type of language.", "");
        this.setContent(Content);
    }
}

