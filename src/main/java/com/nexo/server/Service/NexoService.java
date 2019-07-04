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

    @Autowired
    private GraphService graphService;

    public void insertResult(TighteningProcess tighteningProcess) {
        nexoDAO.insert(tighteningProcess);
        System.out.println("Process "+tighteningProcess.getIdcode()+" inserted");
        graphService.insertGraph(tighteningProcess.getTighteningsteps().get(0).getGraph());
    }

    public List<TighteningProcess> getAllResults() {
        return nexoDAO.findAll();
    }
}
