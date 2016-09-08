package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C056 extends CompositeElement {
    public E3413 e3413;
    public E3412 e3412;


    public C056() {
        this(false, null, null);
    }


    public C056(Boolean Mandatory, String s3413, String s3412) {
        super("C056", "DEPARTMENT OR EMPLOYEE DETAILS", "Code and/or name of a department or employee. Code preferred.");
        this.setMandatory(Mandatory);
        e3413 = new E3413();
        e3412 = new E3412();
        e3413.setContent(s3413);
        e3412.setContent(s3412);
        addElement(e3413);
        addElement(e3412);
    }


}

