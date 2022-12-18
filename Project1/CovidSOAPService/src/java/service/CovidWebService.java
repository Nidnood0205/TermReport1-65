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
import service.Covid;

/**
 *
 * @author DELL
 */
@WebService(serviceName = "CovidWebService")
public class CovidWebService {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidSOAPServicePU");
    /**
     * Web service operation
     */
    @WebMethod(operationName = "findByYear")
    public Covid findByYear(@WebParam(name = "year") int year) {
        EntityManager em = emf.createEntityManager();
        Covid cov = em.find(Covid.class, year);
        return cov;
    }

    /**
     * This is a sample web service operation
     */
    
}
