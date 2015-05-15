package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0026  Application reference  an..14
 * Identification of the application area assigned by the sender, to which the messages in the interchange relate e.g. the message type, if all the messages in the interchange are of the same type.
 */
public class UN_E0026 extends Element {

    public UN_E0026() {
        this(null);
    }

    public UN_E0026(String Content) {
        super("0026", "Application reference", "an..14", "Identification of the application area assigned by the sender, to which the messages in the interchange relate e.g. the message type, if all the messages in the interchange are of the same type.");
        this.setContent(Content);
    }
}

