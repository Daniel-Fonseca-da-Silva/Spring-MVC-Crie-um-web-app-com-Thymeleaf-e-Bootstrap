package com.empresa.projeto.controller;

import com.empresa.projeto.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private PedidoRepository repository;

    @GetMapping("/home")
    public String home(Model model) {
        List<Pedido> pedidos = repository.recuperaTodosPedidos();
        model.addAttribute("pedidos", pedidos);
        return "home";
    }

}
