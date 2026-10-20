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

import br.com.projetointerdisciplinar.copadomundo.copadomundo.Entity.Selecao;
import br.com.projetointerdisciplinar.copadomundo.copadomundo.Service.PaisService;
import br.com.projetointerdisciplinar.copadomundo.copadomundo.Service.SelecaoService;

@Controller
@RequestMapping("/Selecao")
public class SelecaoController {

    @Autowired
    private SelecaoService selecaoService;

    @Autowired
    private PaisService paisService;

    @GetMapping("/listar")
    public String listarSelecoes(Model model) {
        List<Selecao> selecoes = selecaoService.listarTodos();
        model.addAttribute("selecoes", selecoes);
        return "listar-selecoes";
    }

    @GetMapping("/adicionar")
    public String adicionar(Model model) {
        model.addAttribute("selecao", new Selecao());
        model.addAttribute("paises", paisService.listarTodos());
        return "adicionar-selecao";
    }

    @PostMapping("/salvar")
    public String salvarSelecao(@ModelAttribute("selecao") Selecao selecao) {
        selecaoService.salvar(selecao);
        return "redirect:/Selecao/listar";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable("id") Integer id, Model model) {
        Selecao selecao = selecaoService.buscarPorId(id);
        if (selecao == null) {
            return "redirect:/Selecao/listar";
        }
        model.addAttribute("selecao", selecao);
        model.addAttribute("paises", paisService.listarTodos());
        return "editar-selecao";
    }

    @PostMapping("/atualizar")
    public String atualizarSelecao(@ModelAttribute("selecao") Selecao selecao) {
        selecaoService.atualizar(selecao);
        return "redirect:/Selecao/listar";
    }

    @GetMapping("/excluir/{id}")
    public String excluirSelecao(@PathVariable("id") Integer id) {
        selecaoService.deletar(id);
        return "redirect:/Selecao/listar";
    }
}
