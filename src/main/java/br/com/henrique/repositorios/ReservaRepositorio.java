package br.com.henrique.repositorios;

import javax.persistence.EntityManager;

import br.com.henrique.connectionfactory.ConnectionFactory;
import br.com.henrique.entidades.Reserva;

public class ReservaRepositorio extends RepositorioGenerico<Reserva> {

    private static final long serialVersionUID = 1L;

    private EntityManager entityManager = ConnectionFactory.getEntityManager();

    public Reserva buscarReservaId(long id) {
        try {
            Reserva reserva = (Reserva) entityManager
                    .createQuery("SELECT u FROM Reserva u INNER JOIN u.veiculo c WHERE u.id = :id")
                    .setParameter("id", id).getSingleResult();
            return reserva;

        } catch (RuntimeException e) {
            e.printStackTrace();
            return null;
        }
    }

}
