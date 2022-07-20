package org.lafeuille.demo.movies.data;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import javax.validation.constraints.NotNull;
import java.time.Year;

@Node
public record Movie(@NotNull @Id String title, @NotNull Year released) {
}
