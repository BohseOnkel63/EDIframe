package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0509  Role of security provider, coded  an..3
 * Identification of the role of the security provider in relation to the secured item.
 */
public class UN_E0509 extends Element {

    public UN_E0509() {
        this(null);
    }

    public UN_E0509(String Content) {
        super("0509", "Role of security provider, coded", "an..3", "Identification of the role of the security provider in relation to the secured item.");
        this.setContent(Content);
    }
}

