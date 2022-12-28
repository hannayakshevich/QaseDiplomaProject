package api.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Case {

    private String  title;
    private String description;
    private int priority;
    private int severity;
}
