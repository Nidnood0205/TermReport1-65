/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidsoapclient;

import service.Covid;

/**
 *
 * @author DELL
 */
public class CovidSOAPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Covid cb = findByYear(2022);
        System.out.print(cb);
    }

    private static Covid findByYear(int year) {
        service.CovidWebService_Service service = new service.CovidWebService_Service();
        service.CovidWebService port = service.getCovidWebServicePort();
        return port.findByYear(year);
    }
    
}
