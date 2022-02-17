package com.empresa.projeto.controller;

import com.empresa.projeto.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {

        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Cadeira TGT Office Ergho A10");
        pedido.setUrlProduto("https://www.pichau.com.br/cadeira-tgt-office-ergho-a10-preto-tgt-era10-01?gclid=Cj0KCQiA3rKQBhCNARIsACUEW_audVx0dRSo76KauJ3gJGY2e4fZJlSgCf1lZ2Q4vFP29LYL1nt5D1UaAggXEALw_wcB");
        pedido.setDescricao("A cadeira office Ergho A10 foi projetada para garantir que sua postura fique de forma correta durante todo o período de trabalho ou estudo.");
        pedido.setUrlImagem("https://media.pichau.com.br/media/catalog/product/cache/2f958555330323e505eba7ce930bdf27/t/g/tgt-era10-01.jpg");
        pedido.setDataEntrega(LocalDate.now());
        pedido.setValorNegociado(new BigDecimal("829"));

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);

        return "home";
    }
}
