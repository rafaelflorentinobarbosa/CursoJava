package turistando.turistando.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import turistando.turistando.model.VeiculoModel;

public interface VeiculoRepository extends JpaRepository<VeiculoModel, String> {

    @SuppressWarnings("null")
    public List<VeiculoModel> findAll();
}
