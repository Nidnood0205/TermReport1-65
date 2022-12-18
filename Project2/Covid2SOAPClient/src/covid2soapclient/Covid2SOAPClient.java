/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid2soapclient;

import service.Covid2;

/**
 *
 * @author DELL
 */
public class Covid2SOAPClient {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        Covid2 cb = findByYear(2022);
        System.out.print(cb);
    }

    private static Covid2 findByYear(int year) {
        service.Covid2WebService_Service service = new service.Covid2WebService_Service();
        service.Covid2WebService port = service.getCovid2WebServicePort();
        return port.findByYear(year);
    }

    
}
