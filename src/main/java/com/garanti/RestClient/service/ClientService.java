package com.garanti.RestClient.service;

import com.garanti.RestClient.model.Ogretmen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpHeaders httpHeaders;

    private static final String url = "http://localhost:9090/ogretmen/getAll";

    public Ogretmen[] getAllOgretmen () {
//        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
//        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);

        Ogretmen[] response = restTemplate.getForEntity(url, Ogretmen[].class).getBody();

        return response;
    }
}
