package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8246  Dangerous goods label marking  an..4
 * Marking identifying the type of hazardous goods (substance), Loading/Unloading instructions and advising actions in case of emergency.
 */
public class E8246 extends Element {

    public E8246() {
        this(null);
    }

    public E8246(String Content) {
        super("8246", "Dangerous goods label marking", "an..4", "Marking identifying the type of hazardous goods (substance), Loading/Unloading instructions and advising actions in case of emergency.", "");
        this.setContent(Content);
    }
}

