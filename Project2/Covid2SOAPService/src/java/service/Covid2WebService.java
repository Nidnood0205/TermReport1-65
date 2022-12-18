/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import service.Covid2;

/**
 *
 * @author DELL
 */
@WebService(serviceName = "Covid2WebService")
public class Covid2WebService {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid2SOAPServicePU");
    /**
     * Web service operation
     * @param year
     * @return 
     */
    @WebMethod(operationName = "findByYear")
    public Covid2 findByYear(@WebParam(name = "year") int year) {
        EntityManager em = emf.createEntityManager();
        Covid2 cov = em.find(Covid2.class, year);
        return cov;
    }

    /**
     * This is a sample web service operation
     */
    
}
