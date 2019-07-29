package com.nexo.server.Controller;

import com.nexo.server.Entity.TighteningProcess;
import com.nexo.server.Service.NexoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class NexoController {

    @Autowired
    private NexoService nexoService;

    @RequestMapping(method = RequestMethod.GET, value = "/nexo")
    public List<TighteningProcess> getXResults(@RequestParam(defaultValue = "0") int index) {
        return nexoService.getXResults(index);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/nexoAll")
    public List<TighteningProcess> getAll() {
        return nexoService.getAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/nexoLast")
    public TighteningProcess getLastProcess() { return nexoService.getLastProcess(); }

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/nexo",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void nexo(@RequestBody TighteningProcess tighteningProcess) {
        nexoService.insertResult(tighteningProcess);
    }

}
