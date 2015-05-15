package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9417  Government action, coded  an..3
 * To indicate type of government action such as inspection, detention, fumigation, security.
 */
public class E9417 extends Element {

    public E9417() {
        this(null);
    }

    public E9417(String Content) {
        super("9417", "Government action, coded", "an..3", "To indicate type of government action such as inspection, detention, fumigation, security.", "");
        this.setContent(Content);
    }
}

