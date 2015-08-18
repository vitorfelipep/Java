package controle;

import java.util.List;

import modelo.Usuario;
import modelo.UsuarioDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cadastroUsuario")
public class CadastroUsuarioController {
	
	@Autowired
	private UsuarioDAO usuarioDAO;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String listar(Model model){
		List<Usuario> usuarios = usuarioDAO.todos();
		model.addAttribute("lista_usuarios", usuarios );
		return "cadastroUsuario/listarUsuarios";
		
	}
	
	@RequestMapping(value="/novo", method=RequestMethod.GET)
	public String novo(){
		return "cadastroUsuario/cadastrarUsuario";
	}
	
	@RequestMapping(value="/gravarUsuario", method=RequestMethod.POST)
	public String gravar(Usuario usuario, Model model){
		usuarioDAO.salvar(usuario);
		return "redirect:/cadastroUsuario/";
	}
	
	@RequestMapping(value="/alterar", method=RequestMethod.POST)
	public String alterar(Usuario usuario, Model model){
		Usuario usu = usuarioDAO.getUsuario(usuario.getId_usuario());
		model.addAttribute("usuario", usu);
		return "/cadastroUsuario/alterarUsuario";
	}
	
	@RequestMapping(value="/alterarUsuario", method=RequestMethod.POST)
	public String alterarUsuario(Usuario usuario, Model model){
		Usuario usu = usuarioDAO.getUsuario(usuario.getId_usuario());
		usu.setNome_usuario(usuario.getNome_usuario());
		usu.setLogin_usuario(usuario.getLogin_usuario());
		usu.setSenha_usuario(usuario.getSenha_usuario());
		usu.setSetor_usuario(usuario.getSetor_usuario());
		usuarioDAO.atualizar(usu);
		return "redirect:/cadastroUsuario/";
	}
	
	@RequestMapping(value="/excluir", method=RequestMethod.POST)
	public String excluir(Usuario usuario, Model model){
		Usuario usu = usuarioDAO.getUsuario(usuario.getId_usuario());
		usuarioDAO.apagar(usu);
		return "redirect:/cadastroUsuario/";
	}

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
	
	
	
}
