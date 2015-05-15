/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UN_EDIFACT;

/**
 *
 * @author mannelini
 */
public interface ElementInterface {
    
    /**
     *
     * @return 
     */
    String getNote();

    /**
     *
     * @return
     */
    String getDescription();

    /**
     *
     * @return
     */
    String getLongDescription();

    /**
     *
     * @return
     */
    String getFormatString();

    /**
     *
     * @return
     */
    String getTag();

    /**
     *
     * @return
     */
    @Override
    String toString();

    /**
     * 
     * @param Note 
     */
    void setNote(String Note);
    /**
     *
     * @param Description
     */
    void setDescription(String Description);

    /**
     *
     * @param LongDescription
     */
    void setLongDescription(String LongDescription);

    /**
     *
     * @param FormatString
     */
    void setFormatString(String FormatString);

    /**
     *
     * @param Tag
     */
    void setTag(String Tag);

    /**
     *
     * @param Mandatory
     */
    void setMandatory(boolean Mandatory);

    /**
     *
     * @param Content
     */
    void setContent(String Content);
    
    /**
     *
     * @throws ValidityException
     */
    void validate() throws ValidityException;

    /**
     *
     * @return
     */
    boolean isMandatory();
}
