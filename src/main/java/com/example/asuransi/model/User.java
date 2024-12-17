import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "m_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id_user")
    private UUID idUser;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "fullname", nullable = false)
    private String fullName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "account_expired", nullable = false)
    private boolean accountExpired = false;

    @Column(name = "account_locked", nullable = false)
    private boolean accountLocked = false;

    @Column(name = "credential_is_expired", nullable = false)
    private boolean credentialExpired = false;

    @Column(name = "is_active", nullable = false)
    private boolean isActive = true;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<UserRole> roles;

    // Audit fields
    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date", updatable = false)
    private java.time.LocalDateTime createdDate;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_date")
    private java.time.LocalDateTime modifiedDate;
}
