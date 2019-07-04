package com.nexo.server.Controller;


import com.nexo.server.Entity.Graph;
import com.nexo.server.Service.GraphService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nexoGraph")
@CrossOrigin
public class GraphController {

    @Autowired
    private GraphService graphService;

    @RequestMapping(method = RequestMethod.GET)
    public Graph getLastGraph() { return graphService.getLastGraph(); }
}
