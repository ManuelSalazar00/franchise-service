package co.com.bancolombia.model;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder(toBuilder = true)
public class Franchise {


    private final Integer id;
    private final String name;
    private final List<Branch> branches;

    public Franchise(Integer id, String name, List<Branch> branches) {
        this.id = id;
        this.name = name;
        this.branches = branches != null ? List.copyOf(branches) : List.of();

    }

    public Franchise addBranch(Branch newBranch) {
        List<Branch> updated = new ArrayList<>(this.branches);
        updated.add(newBranch);
        return new Franchise(this.id, this.name, updated);
    }
}
