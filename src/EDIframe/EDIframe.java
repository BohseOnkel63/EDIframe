/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDIframe;

import UN_EDIFACT.D96A.BGM;
import UN_EDIFACT.D96A.DTM;
import UN_EDIFACT.ValidityException;

/**
 *
 * @author mannelini
 */
public class EDIframe {
    
    /**
     *
     */
    public EDIframe() {
        /*Properties prs = System.getProperties();

        for(String item : prs.stringPropertyNames()) {
            System.out.println(item + "=" + System.getProperty(item));
        }*/
        BGM sBGM = new BGM();
        sBGM.eC002.e1001.setContent("380");
        sBGM.eC002.e1000.setContent("1000");
        sBGM.e1004.setContent("123456789");
        sBGM.e1225.setContent("9");
        DTM sDTM = new DTM("137", "20150515", "102");
        try {
            sBGM.validate();
            sDTM.validate();
            System.out.println(sBGM.toString());
            System.out.println(sDTM.toString());
        } catch(ValidityException ve) {
            System.out.println("Error: " + ve.getMessage());
        }
    }

    /**
     *
     * @param inputStr
     * @return
     */
    public String identify(String inputStr) {
        String[] segments;
        boolean isUNA = false;
        String response = "UNKNOWN";
        
        if (inputStr.length() > 0) {
            if (inputStr.startsWith("'''ED2'''")) {
                response = "OVT";
            } else {
                segments = inputStr.split("'");
                for (String segment : segments) {
                    if (segment.startsWith("UNA")) {
                        response = "UNA";
                        //return "UNA";
                    } else {
                        if (segment.startsWith("UNB")) {
                            if (response.equalsIgnoreCase("UNA")) {
                                return("UNAUNB");
                            }
                            response = "UNB";
                        }
                    }
                }
            }
        }
        return response;
    }
    
    
    private static void printHTMLheader() {
        System.out.println("<!doctype html public \"-//W3C//DTD HTML 3.2 Final//EN\">");
        System.out.println("<html>");
        System.out.println("<head><title>EDI-frame info</title>");
        System.out.println("<style>");
        System.out.println("table, th, td {");
        System.out.println("    border: 1px solid black;");
        System.out.println("    border-collapse: collapse;");
        System.out.println("}");
        System.out.println("</style>");
        System.out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />");
        System.out.println("</head>");
        System.out.println("<body>");
    }
    
    private static void printHTMLtail() {
        System.out.println("</body>");
        System.out.println("</html>");
    }
}
