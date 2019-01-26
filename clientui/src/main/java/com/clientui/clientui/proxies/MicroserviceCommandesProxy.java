package com.clientui.clientui.proxies;

import com.clientui.clientui.beans.CommandesBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@FeignClient(name = "microservice-commandes", url = "localhost:9002")
public interface MicroserviceCommandesProxy {

    @PostMapping(value = "/commandes")
    CommandesBean ajouterCommande(@RequestBody CommandesBean commande);
}
