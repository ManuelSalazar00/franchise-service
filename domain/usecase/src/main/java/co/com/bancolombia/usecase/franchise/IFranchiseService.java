package co.com.bancolombia.usecase.franchise;

import co.com.bancolombia.model.Franchise;
import co.com.bancolombia.usecase.franchise.dtos.CreateFranchiseRequest;
import co.com.bancolombia.usecase.franchise.dtos.MaxStockDTO;

import java.util.List;

public interface IFranchiseService {

    Franchise createFranchise(CreateFranchiseRequest request);
    Boolean addBranchToFranchise(Integer franchiseId, CreateFranchiseRequest request);
    List<MaxStockDTO> maximumFranchiseStock(Integer id);

}
