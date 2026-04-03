package co.com.bancolombia.usecase.franchise;

import co.com.bancolombia.model.Branch;
import co.com.bancolombia.model.Franchise;
import co.com.bancolombia.usecase.franchise.dtos.CreateFranchiseRequest;
import co.com.bancolombia.usecase.franchise.dtos.MaxStockDTO;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class FranchiseUseCase implements IFranchiseService {

    private final IFranchiseRepository franchiseRepository;

    @Override
    public Franchise createFranchise(CreateFranchiseRequest request) {

        if (franchiseRepository.existName(request.name())) {
            throw new IllegalArgumentException("La franquicia ya existe: " + request.name());
        }

        Franchise franchiseDomain = new Franchise(null, request.name(), new ArrayList<>());
        return franchiseRepository.create(franchiseDomain);
    }

    @Override
    public Boolean addBranchToFranchise(Integer franchiseId, CreateFranchiseRequest request) {
        return franchiseRepository.findById(franchiseId).map(franchise -> {
            Branch newBranch = new Branch(null, null, request.name(), new ArrayList<>());

            Franchise upsateFranchise = franchise.addBranch(newBranch);

            franchiseRepository.create(upsateFranchise);
            return true;
        }).orElse(false);
    }

    @Override
    public List<MaxStockDTO> maximumFranchiseStock(Integer id) {
        return franchiseRepository.consultMaxStock(id);
    }
}
