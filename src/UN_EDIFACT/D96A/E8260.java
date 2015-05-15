package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8260  Equipment identification number  an..17
 * Marks (letters and/or numbers) which identify equipment e.g. unit load device.
 */
public class E8260 extends Element {

    public E8260() {
        this(null);
    }

    public E8260(String Content) {
        super("8260", "Equipment identification number", "an..17", "Marks (letters and/or numbers) which identify equipment e.g. unit load device.", "");
        this.setContent(Content);
    }
}

