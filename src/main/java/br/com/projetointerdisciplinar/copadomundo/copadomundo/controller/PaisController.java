package br.com.projetointerdisciplinar.copadomundo.copadomundo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetointerdisciplinar.copadomundo.copadomundo.Entity.Pais;
import br.com.projetointerdisciplinar.copadomundo.copadomundo.Service.PaisService;

@Controller
@RequestMapping("/Pais")
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping("/listar")
    public String listarPaises(Model model) {
        List<Pais> paises = paisService.listarTodos();
        model.addAttribute("paises", paises);
        return "listar-paises";
    }

    @GetMapping("/adicionar")
    public String adicionar(Model model) {
        model.addAttribute("pais", new Pais());
        return "adicionar-pais";
    }

    @PostMapping("/salvar")
    public String salvarPais(@ModelAttribute("pais") Pais pais) {
        paisService.salvar(pais);
        return "redirect:/Pais/listar";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable("id") Integer id, Model model) {
        Pais pais = paisService.buscarPorId(id);
        if (pais == null) {
            return "redirect:/Pais/listar";
        }
        model.addAttribute("pais", pais);
        return "editar-pais";
    }

    @PostMapping("/atualizar")
    public String atualizarPais(@ModelAttribute("pais") Pais pais) {
        paisService.atualizar(pais);
        return "redirect:/Pais/listar";
    }

    @GetMapping("/excluir/{id}")
    public String excluirPais(@PathVariable("id") Integer id) {
        paisService.deletar(id);
        return "redirect:/Pais/listar";
    }
}
