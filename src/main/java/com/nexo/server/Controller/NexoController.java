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

    @RequestMapping(method = RequestMethod.GET)
    public List<TighteningProcess> getAllResults() {
        return nexoService.getAllResults();
    }

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void nexo(@RequestBody TighteningProcess tighteningProcess) {
        nexoService.insertResult(tighteningProcess);
    }

}
