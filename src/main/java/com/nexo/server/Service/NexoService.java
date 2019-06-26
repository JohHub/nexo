package com.nexo.server.Service;

import com.nexo.server.DAO.NexoDAO;
import com.nexo.server.Entity.TighteningProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NexoService {

    @Autowired
    private NexoDAO nexoDAO;

    public void insertResult(TighteningProcess tighteningProcess) {
        nexoDAO.insert(tighteningProcess);
        System.out.println("Nr.: "+tighteningProcess.getNr());
        System.out.println("IdCode: "+tighteningProcess.getIdcode());
        System.out.println("test2");
        System.out.println("another test");
    }

    public List<TighteningProcess> getAllResults() {
        return nexoDAO.findAll();
    }
}
