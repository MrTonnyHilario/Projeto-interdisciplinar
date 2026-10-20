package br.com.projetointerdisciplinar.copadomundo.copadomundo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.projetointerdisciplinar.copadomundo.copadomundo.Entity.Jogo;
import br.com.projetointerdisciplinar.copadomundo.copadomundo.Service.JogadorService;
import br.com.projetointerdisciplinar.copadomundo.copadomundo.Service.JogoService;


@Controller
@RequestMapping("/Jogo")
public class JogoController {
    
    @Autowired
    private JogoService jogoService;

    @GetMapping("/listar")
    public String listarJogos(Model model) {
        List<Jogo> jogo = jogoService.listarTodos();
        model.addAttribute("jogos", jogo);
        return "listar-jogos";
    }

    @GetMapping("/adicionar")
    public String Adicionar(Model model) {
        Jogo jogo = new Jogo();
        model.addAttribute("jogo", jogo);
        return "adicionar-jogo";
    }
    @PostMapping("/salvar")
    public String salvarJogo(@ModelAttribute("jogo") Jogo jogo) {
        jogoService.salvar(jogo);
        return "redirect:/Jogo/listar";
    }

    @GetMapping("/editar/{id}")
    public String Editar(@PathVariable("id") Integer id, Model model) {
        Jogo jogo = jogoService.buscarPorId(id);
        model.addAttribute("jogo", jogo);
        return "editar-jogo";
    }

    @PostMapping("/atualizar")
    public String atualizarJogo(@ModelAttribute("jogo") Jogo jogo) {
        jogoService.atualizar(jogo);
        return "redirect:/Jogo/listar";
    }

    @GetMapping("/excluir/{id}")
    public String excluirJogador(@PathVariable("id") Integer id) {
        jogoService.deletar(id);
        return "redirect:/Jogo/listar";
    
    }
}
