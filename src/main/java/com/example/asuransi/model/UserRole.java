import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "r_user_roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRole {

    @EmbeddedId
    private UserRoleId id;

    @ManyToOne
    @MapsId("idUser")
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @MapsId("roleName")
    @JoinColumn(name = "role_name")
    private Role role;
}
