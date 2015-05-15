/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;

/**
 *
 * @author mannelini
 */
public class DTM {
    private final String Tag ="DTM";
    private final String Description = "DATE/TIME/PERIOD";
    private final String LongDescription = "To specify date, and/or time, or period.";
    private final boolean Mandatory = false;
    
    /**
     *
     */
    public C507 eC507;

    /**
     *
     */
    public DTM() {
        eC507 = new C507();
        eC507.setMandatory(true);
    }
    
    /**
     *
     * @param StrE2005
     * @param StrE2380
     * @param StrE2379
     */
    public DTM(String StrE2005, String StrE2380, String StrE2379) {
        eC507 = new C507(true, StrE2005, StrE2380, StrE2379);
    }
    
    /**
     *
     * @throws ValidityException
     */
    public void validate() throws ValidityException {
        try {
            eC507.validate();
        } catch (ValidityException ex) {
            throw new ValidityException(this.Tag + "/" + ex.getMessage());
        }
    }
    
    @Override
    public String toString() {
        String output;
        output = this.Tag + "+" + eC507.toString();
        return EdiFunctions.trim(output) + "'";
    }
}
