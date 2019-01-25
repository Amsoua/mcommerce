package com.clientui.clientui.controller;

import com.clientui.clientui.beans.ProductBean;
import com.clientui.clientui.proxies.MicroserviceProductProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    MicroserviceProductProxy mProductProxies;

    @RequestMapping("/")
    public String accueil(Model model){

        List<ProductBean> listeProduits = mProductProxies.listeDesProduits();

        model.addAttribute("produits", listeProduits);

        return "Accueil";
    }
}
