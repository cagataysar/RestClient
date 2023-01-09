package com.garanti.RestClient.service;

import com.garanti.RestClient.model.Ogretmen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service
public class ClientService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String url = "http://localhost:9090/ogretmen/getAll";

    /*public Ogretmen[] getAllOgretmen () {

        return restTemplate.getForEntity(url, Ogretmen[].class).getBody();
    }*/

    public Ogretmen[] getAllOgretmen () {
        HashMap<String, Object> uriVariables = new HashMap<String, Object>();
        ResponseEntity< Ogretmen[] > response = restTemplate.getForEntity(url, Ogretmen[].class, uriVariables);
        Ogretmen ogretmen = response.getBody()[ 1 ];
        System.err.println(ogretmen.getNAME() + " - " + ogretmen.getID());
        return new Ogretmen[ 0 ];
    }
}
