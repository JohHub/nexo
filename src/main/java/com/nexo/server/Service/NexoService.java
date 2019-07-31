package com.nexo.server.Service;

import com.nexo.server.DAO.NexoDAO;
import com.nexo.server.Entity.TighteningProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NexoService {

    @Autowired
    private NexoDAO nexoDAO;

    public void insertResult(TighteningProcess tighteningProcess) {
        nexoDAO.insert(tighteningProcess);
        System.out.println("Process " + tighteningProcess.getIdCode() + " inserted");
    }

    public List<TighteningProcess> getXResults(int index) {
        Slice<TighteningProcess> slice;
        Pageable pageable = PageRequest.of(index * 10, 1, Sort.Direction.DESC, "date");

        List<TighteningProcess> content = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            slice = nexoDAO.findAll(pageable);
            if (!slice.hasContent()) {
                return content;
            }
            content.add(slice.getContent().get(0));
            if (slice.isLast()) {
                return content;
            }
            pageable = slice.nextPageable();
        }
        return content;
    }


    public TighteningProcess getLastProcess() {
        Pageable pageable = PageRequest.of(0, 1, Sort.Direction.DESC, "date");
        Page<TighteningProcess> processPage = nexoDAO.findAll(pageable);

        return processPage.getContent().get(0);
    }

    public List<TighteningProcess> getAll() {
        return nexoDAO.findAll();
    }

    public TighteningProcess getByIdCode(String idCode) {
        return nexoDAO.findByIdCode(idCode);
    }
}
