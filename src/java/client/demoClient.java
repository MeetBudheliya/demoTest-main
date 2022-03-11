/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:GenericResource [generic]<br>
 * USAGE:
 * <pre>
 *        demoClient client = new demoClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author meet
 */
public class demoClient {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/WEB-INF/webresources";

    public demoClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("generic");
    }

    public void insert(String name, String price, String date) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("insert/{0}/{1}/{2}", new Object[]{name, price, date})).request().post(null);
    }

    public void close() {
        client.close();
    }
    
}
