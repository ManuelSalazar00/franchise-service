package co.com.bancolombia.usecase.franchise.dtos;

public record MaxStockDTO(
        String nameBranch,
        String nameProduct,
        int amount
) {}
