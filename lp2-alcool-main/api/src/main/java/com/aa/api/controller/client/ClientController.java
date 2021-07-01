package com.aa.api.controller.client;

import com.aa.api.controller.client.dto.ClientRequest;
import com.aa.core.domain.Client;
import com.aa.core.port.driver.RegisterClientPort;
import com.aa.core.userstories.RegisterClientUS;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {

    private final RegisterClientPort registerClient;

    @PostMapping
    public Client registerClient(@RequestBody ClientRequest clientRequest){
        return registerClient.execute(clientRequest.toClient());
    }

}
