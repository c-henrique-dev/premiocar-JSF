package br.com.henrique.model.servicos;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.com.henrique.repositorios.UsuarioRepositorio;
import br.com.henrique.entidades.Usuario;
import br.com.henrique.exceptions.EnderecoException;
import br.com.henrique.exceptions.UsuarioException;

public class UsuarioService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private UsuarioRepositorio repositorio;

    public void salvar(Usuario usuario) throws UsuarioException, EnderecoException {

        if (usuario.getCpf().length() < 14) {

            throw new UsuarioException("CPF inválido. Insira um CPF válido com 11 caracteres");
        }
        if (usuario.getNome().length() < 4) {
            throw new UsuarioException("Insira um nome com pelo menos 5 caracteres");
        }

        if (usuario.getSobrenome().length() < 4) {
            throw new UsuarioException("Insira um sobrenome com pelo menos 5 caracteres");
        }
        if (usuario.getTelefone().length() < 14) {
            throw new UsuarioException("Informe um celular com 9 dígitos");
        }
        if (usuario.getEndereco().getCep().length() < 9) {
            throw new EnderecoException("Insira um CEP válido");
        } else {
            this.repositorio.salvar(usuario);

        }

    }

    public void excluir(Usuario usuario) throws UsuarioException {
        if (usuario.getId() != null) {
            this.repositorio.excluir(Usuario.class, usuario.getId());
        } else {
            throw new UsuarioException("Usuário não existe!");
        }
    }

    public Usuario buscarUsuarioPorCpf(String cpf) {
        Usuario usuario = this.repositorio.buscarPorCPF(cpf);
        return usuario;
    }

    public List<Usuario> listar() {
        return this.repositorio.listarTudo(Usuario.class, "Select u from Usuario u");
    }
}
