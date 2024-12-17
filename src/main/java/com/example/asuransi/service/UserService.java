import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User createUser(String username, String password, String email, String fullName, String roleName) {
        Role role = roleRepository.findById(roleName)
                .orElseThrow(() -> new RuntimeException("Role not found"));

        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        user.setEmail(email);
        user.setFullName(fullName);
        user.setCreatedBy("System");
        user.setCreatedDate(LocalDateTime.now());

        UserRole userRole = new UserRole();
        userRole.setId(new UserRoleId(roleName, user.getIdUser()));
        userRole.setUser(user);
        userRole.setRole(role);

        user.setRoles(Set.of(userRole));

        return userRepository.save(user);
    }
}
