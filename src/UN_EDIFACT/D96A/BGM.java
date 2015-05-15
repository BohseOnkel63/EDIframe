/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;

/**
 * UN-EDIFACT
 * Segment BGM, BEGINNING OF MESSAGE
 * 
 * @author mannelini
 */
public class BGM {
    private final String Tag = "BGM";
    private final String Description = "BEGINNING OF MESSAGE";
    private boolean Mandatory;
    
    /**
     * Composite element C002
     */
    public C002 eC002;

    /**
     *
     */
    public E1004 e1004;

    /**
     *
     */
    public E1225 e1225;

    /**
     *
     */
    public E4343 e4343;

    /**
     *
     */
    public BGM() {
        this(false, null, null, null, null, null, null, null);
    }
    
    /**
     *
     * @param Mandatory
     * @param s1001
     * @param s1131
     * @param s3055
     * @param s1000
     * @param s1004
     * @param s1225
     * @param s4343
     */
    public BGM(Boolean Mandatory, String s1001, String s1131, String s3055, String s1000, String s1004, String s1225, String s4343) {
        this.Mandatory = Mandatory;
        eC002 = new C002(false, s1001, s1131, s3055, s1000);
        e1004 = new E1004(s1004);
        e1225 = new E1225(s1225);
        e4343 = new E4343(s4343);
    }

    /**
     *
     * @throws ValidityException
     */
    public void validate() throws ValidityException {
        try {
            eC002.validate();
            e1004.validate();
            e1225.validate();
            e4343.validate();
        } catch (ValidityException ex) {
            throw new ValidityException(this.Tag + "/" + ex.getMessage());
        }
    }

    @Override
    public String toString() {
        String output;
        output = this.Tag + "+" + eC002.toString() + "+" + e1004.toString() + "+" + e1225.toString() + "+" + e4343.toString();
        return EdiFunctions.trim(output) + "'";
    }
}
