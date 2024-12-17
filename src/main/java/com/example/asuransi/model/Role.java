import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "m_role")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @Column(name = "role_name", nullable = false)
    private String roleName;

    @Column(name = "keterangan", nullable = false)
    private String description;

    @Column(name = "is_active", nullable = false)
    private boolean isActive = true;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date", updatable = false)
    private java.time.LocalDateTime createdDate;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_date")
    private java.time.LocalDateTime modifiedDate;
}
