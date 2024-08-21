package java.br.com.flavianoriko.ekflc.modules.course.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO {
    private String description;
    private String name;
    private String type;
    private UUID id;
    
}
