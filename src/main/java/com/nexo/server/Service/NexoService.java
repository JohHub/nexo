package com.nexo.server.Service;

import com.nexo.server.DAO.NexoDAO;
import com.nexo.server.Entity.Tightening_Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NexoService {

    @Autowired
    private NexoDAO nexoDAO;

    public void insertResult(Tightening_Result tightening_result) {
        requestBin(tightening_result);
        nexoDAO.insert(tightening_result);
        System.out.println("Nr.: " + tightening_result.getNr());
        System.out.println("IdCode: " + tightening_result.getIdCode());
    }

    public List<Tightening_Result> getAllResults() {
        return nexoDAO.findAll();
    }

    private void requestBin(Tightening_Result tightening_result) {
        final String uri = "http://requestbin.fullcontact.com/112m0yb1";
        RestTemplate restTemplate = new RestTemplate();

        HttpEntity<Tightening_Result> request = new HttpEntity<>(tightening_result);
        restTemplate.postForEntity(uri, request, null);
    }
}