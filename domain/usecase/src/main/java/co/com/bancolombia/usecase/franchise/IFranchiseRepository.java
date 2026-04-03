package co.com.bancolombia.usecase.franchise;

import co.com.bancolombia.model.Franchise;
import co.com.bancolombia.usecase.franchise.dtos.MaxStockDTO;

import java.util.List;
import java.util.Optional;

public interface IFranchiseRepository {

    Franchise create(Franchise franchise);

    Boolean existName(String name);

    Optional<Franchise> findById(Integer id);

    List<MaxStockDTO> consultMaxStock(Integer id);
}
