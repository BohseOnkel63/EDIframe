/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UN_EDIFACT.V4;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;

/**
 *
 * @author mannelini
 */
public class UN_S002 {
    private final String Tag = "S002";
    private final String Description = "INTERCHANGE SENDER";
    private final String LongDescription  = "Identification of the sender of the interchange.";
    private final boolean Mandatory = false;

    /**
     *
     */
    public UN_E0004 e0004;

    /**
     *
     */
    public UN_E0007 e0007;

    /**
     *
     */
    public UN_E0008 e0008;

    /**
     *
     */
    public UN_E0042 e0042;

    /**
     *
     */
    public UN_S002() {
        this(null, null, null, null);
    }
    
    /**
     *
     * @param s0004
     * @param s0007
     * @param s0008
     * @param s0042
     */
    public UN_S002(String s0004, String s0007, String s0008, String s0042) {
        e0004 = new UN_E0004(s0004);
        e0004.setMandatory(true);
        e0007 = new UN_E0007(s0007);
        e0008 = new UN_E0008(s0008);
        e0042 = new UN_E0042(s0042);
    }
    /**
     *
     * @throws ValidityException
     */
    public void validate() throws ValidityException {
        try {
            e0004.validate();
            e0007.validate();
            e0008.validate();
            e0042.validate();
        } catch (ValidityException ex) {
            throw new ValidityException(this.Tag + "/" + ex.getMessage());
        }
    }
    
    @Override
    public String toString() {
        String output;

        output = e0004.toString() + ":" + e0007.toString() + ":" + e0008.toString() + ":" + e0042.toString();
        return EdiFunctions.trim(output);
    }
    public void setContent(String ediString) {
        String[] array = ediString.split(":");
        try {
            e0004.setContent(array[0]);
            e0007.setContent(array[1]);
            e0008.setContent(array[2]);
            e0042.setContent(array[3]);
        } catch(java.lang.ArrayIndexOutOfBoundsException ex) {
            System.out.println("UN_S002: ArrayIndexOutOfBoundsException: " + ex.getMessage());
        }
    }
    
}
