package controle;

import java.util.List;

import modelo.Aplicacao;
import modelo.AplicacaoDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cadastroAplicacao")
public class CadastroAplicacaoController {
	
	@Autowired
	private AplicacaoDAO aplicacaoDAO;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String listarUsuarios(Model model){
		List<Aplicacao> aplicacoes = aplicacaoDAO.todos();
		model.addAttribute("lista_aplicacoes", aplicacoes );
		return "cadastroAplicacao/listarAplicacoes";
		
	}
	
	@RequestMapping(value="/novo", method=RequestMethod.GET)
	public String novo(){
		return "cadastroAplicacao/cadastrarAplicacao";
	}
	
	@RequestMapping(value="/gravarAplicacao", method=RequestMethod.POST)
	public String gravar(Aplicacao aplicacao, Model model){
		aplicacaoDAO.salvar(aplicacao);
		return "redirect:/cadastroAplicacao/";
	}
	
	@RequestMapping(value="/alterar", method=RequestMethod.POST)
	public String alterar(Aplicacao aplicacao, Model model){
		Aplicacao app = aplicacaoDAO.getAplicacao(aplicacao.getId_aplicacao());
		model.addAttribute("aplicacao", app);
		return "/cadastroAplicacao/alterarAplicacao";
	}
	
	@RequestMapping(value="/alterarAplicacao", method=RequestMethod.POST)
	public String alterarAplicacao(Aplicacao aplicacao, Model model){
		Aplicacao app = aplicacaoDAO.getAplicacao(aplicacao.getId_aplicacao());
		app.setNome_aplicacao(aplicacao.getNome_aplicacao());
		app.setDescricao_aplicacao(aplicacao.getDescricao_aplicacao());
		app.setSetor(aplicacao.getSetor());
		aplicacaoDAO.atualizar(app);
		return "redirect:/cadastroAplicacao/";
	}
	
	@RequestMapping(value="/excluir", method=RequestMethod.POST)
	public String excluir(Aplicacao aplicacao, Model model){
		Aplicacao app = aplicacaoDAO.getAplicacao(aplicacao.getId_aplicacao());
		aplicacaoDAO.apagar(app);
		return "redirect:/cadastroAplicacao/";
	}

	public AplicacaoDAO getAplicacaoDAO() {
		return aplicacaoDAO;
	}

	public void setAplicacaoDAO(AplicacaoDAO aplicacaoDAO) {
		this.aplicacaoDAO = aplicacaoDAO;
	}

}
