package br.com.henrique.model.servicos;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

import br.com.henrique.repositorios.ReservaRepositorio;
import br.com.henrique.entidades.Reserva;
import br.com.henrique.exceptions.ReservaException;

public class ReservaService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    ReservaRepositorio repositorioReserva;

    public void salvarReserva(Reserva reserva) throws ReservaException {
        if (reserva != null) {

            this.repositorioReserva.salvar(reserva);

        } else {
            throw new ReservaException("Veículo não encontrado ");
        }

    }

    public Reserva listarReservaPorId(long id) {
        return this.repositorioReserva.buscarReservaId(id);
    }

    public List<Reserva> listarTudo() {
        return this.repositorioReserva.listarTudo(Reserva.class,
                "SELECT r FROM Reserva r INNER JOIN r.veiculo  WHERE r.veiculo = r.veiculo.id");
    }

}
