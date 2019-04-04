package com.nexo.server.Service;

import com.nexo.server.DAO.NexoDAO;
import com.nexo.server.Entity.Tightening_Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NexoService {

    @Autowired
    private NexoDAO nexoDAO;

    public void insertResult(Tightening_Result tightening_result) {
        nexoDAO.insert(tightening_result);
        System.out.println("Nr.: "+tightening_result.getNr());
        System.out.println("IdCode: "+tightening_result.getIdCode());
        System.out.println("test2");
    }

    public List<Tightening_Result> getAllResults() {
        return nexoDAO.findAll();
    }
}
