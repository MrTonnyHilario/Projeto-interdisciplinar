package br.com.projetointerdisciplinar.copadomundo.copadomundo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetointerdisciplinar.copadomundo.copadomundo.Entity.Jogador;
import br.com.projetointerdisciplinar.copadomundo.copadomundo.Service.JogadorService;



import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Jogador")
public class JogadorControler {
     
    @Autowired
    private JogadorService jogadorService;

    @GetMapping("/listar")
    public String listarJogadores(Model model) {
        List<Jogador> jogadores = jogadorService.listarTodos();
        model.addAttribute("jogadores", jogadores);
        return "listar-jogadores";
    }

    @GetMapping("/adicionar")
    public String mostrarFormularioAdicionar(Model model) {
        Jogador jogador = new Jogador();
        model.addAttribute("jogador", jogador);
        return "adicionar-jogador";
    }

    @PostMapping("/salvar")
    public String salvarJogador(@ModelAttribute("jogador") Jogador jogador) {
        jogadorService.salvar(jogador);
        return "redirect:/Jogador/listar";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable("id") Integer id, Model model) {
        Jogador jogador = jogadorService.buscarPorId(id);
        model.addAttribute("jogador", jogador);
        return "editar-jogador";
    }

    @PostMapping("/atualizar")
    public String atualizarJogador(@ModelAttribute("jogador") Jogador jogador) {
        jogadorService.atualizar(jogador);
        return "redirect:/Jogador/listar";
    }

    @GetMapping("/excluir/{id}")
    public String excluirJogador(@PathVariable("id") Integer id) {
        jogadorService.deletar(id);
        return "redirect:/Jogador/listar";
    }
    
}
