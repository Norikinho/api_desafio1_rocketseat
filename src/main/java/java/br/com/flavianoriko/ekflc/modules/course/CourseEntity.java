package java.br.com.flavianoriko.ekflc.modules.course;

import java.util.UUID;


import lombok.Data;

@Data
@Entity(name="Course")
public class CourseEntity {
    @Id 
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String description;
    
    @Length(min=6,max =30)
    private String name;

    @Length(min=6,max =30)
    private String active;

    @CreationTimestamp
    private LocalDateTime createdAt;
    
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    
}

