package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0538  Key name  an..35
 * Name used to establish a key relationship between the parties.
 */
public class UN_E0538 extends Element {

    public UN_E0538() {
        this(null);
    }

    public UN_E0538(String Content) {
        super("0538", "Key name", "an..35", "Name used to establish a key relationship between the parties.");
        this.setContent(Content);
    }
}

