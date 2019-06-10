package com.nexo.server.Controller;

import com.nexo.server.Entity.TighteningProcess;
import com.nexo.server.Service.NexoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nexo")
@CrossOrigin
public class NexoController {

    @Autowired
    private NexoService nexoService;

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void nexo(@RequestBody TighteningProcess tightening_result) {
        nexoService.insertResult(tightening_result);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public void nexoList(@RequestBody List<TighteningProcess> tightening_results) {
        System.out.println("List received");
        for (TighteningProcess ti:tightening_results
             ) {
            nexoService.insertResult(ti);
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<TighteningProcess> getAllResults() {
        return nexoService.getAllResults();
    }

}
