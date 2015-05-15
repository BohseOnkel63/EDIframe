package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3499  Sex, coded  an..3
 * Code giving the gender of a person, animal or plant.
 */
public class E3499 extends Element {

    public E3499() {
        this(null);
    }

    public E3499(String Content) {
        super("3499", "Sex, coded", "an..3", "Code giving the gender of a person, animal or plant.", "Use ISO 5218 Representation of human sexes");
        this.setContent(Content);
    }
}

