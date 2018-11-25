package eDoe;

import controllers.EDoeController;
import easyaccept.EasyAccept; 

public class Facade {
	
	EDoeController ec;
	
	public Facade() {
		this.ec = new EDoeController();
	}
	
	public String adicionaDoador(String id, String nome, String email, String celular, String classe) {
		return this.ec.adicionarDoador(id, nome, email, celular, classe);
	}
	
	public String pesquisaUsuarioPorId(String id) {
		return this.ec.pesquisarUsuarioPorId(id);
	}
	
	public String pesquisaUsuarioPorNome(String nome) {
		return this.ec.pesquisarUsuarioPorNome(nome);
	} 
	
	public String atualizaUsuario(String id, String nome, String email, String celular) {
		return this.ec.atualizarUsuario(id, nome, email, celular);
	} 
	
	public void removeUsuario(String id) {
		this.ec.removerUsuario(id);
	}

	public void lerReceptores(String caminho) {
	   this.ec.lerReceptores(caminho);
    }
	
	public void adicionaDescritor(String descricao) {
		this.ec.adicionarDescritor(descricao);
	}
	
	public int adicionaItemParaDoacao(String idDoador, String descricao, int quantidade, String tags) {
		return this.ec.adicionarItem(idDoador,descricao, quantidade, tags);
	}
	
	public String exibeItem(int idItem, String idDoador) {
		return this.ec.exibirItem(idItem, idDoador);
	}
	
	public String atualizaItemParaDoacao(int idItem, String idDoador, int quantidade, String tags) {
		return this.ec.atualizarItem(idItem, idDoador, quantidade, tags);
	}
	
	public void removeItemParaDoacao(int idItem, String idDoador) {
		this.ec.removerItem(idItem, idDoador);
	}
	
    public static void main(String[] args) {
        args = new String[] {"eDoe.Facade", "acceptance_tests/use_case_1.txt", "acceptance_tests/use_case_2.txt"};
        EasyAccept.main(args);
    }
}
