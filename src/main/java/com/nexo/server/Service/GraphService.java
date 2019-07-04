package com.nexo.server.Service;

import com.nexo.server.DAO.GraphDAO;
import com.nexo.server.Entity.Graph;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class GraphService {

    @Autowired
    private GraphDAO graphDAO;

    public Graph getLastGraph() {

        Pageable pageable = PageRequest.of(0,1, Sort.Direction.DESC, "$natural");
        Page<Graph> graphs = graphDAO.findAll(pageable);

        return graphs.getContent().get(0);
    }

    void insertGraph(Graph graph) {
        graphDAO.insert(graph);
        System.out.println("Graph inserted");
    }
}