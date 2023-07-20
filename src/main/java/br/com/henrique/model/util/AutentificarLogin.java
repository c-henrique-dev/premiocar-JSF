package br.com.henrique.model.util;

import java.io.Serializable;

import javax.persistence.EntityManager;

import br.com.henrique.connectionfactory.ConnectionFactory;
import br.com.henrique.entidades.Usuario;

public class AutentificarLogin implements Serializable {

    private static final long serialVersionUID = 1L;
    private EntityManager entityManager = ConnectionFactory.getEntityManager();

    public Usuario Autentificar(String email, String senha) {

        try {
            Usuario usuario = (Usuario) this.entityManager
                    .createQuery("Select c from Usuario c WHERE c.email = :email and c.senha = :senha")
                    .setParameter("senha", senha).setParameter("email", email).getSingleResult();
            System.out.println(usuario.getNome());
            return usuario;

        } catch (RuntimeException e) {
            System.out.println(e.toString());
            return null;

        }

    }
}
