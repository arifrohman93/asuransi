@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<?> createUser(@RequestBody UserRequest userRequest) {
        User user = userService.createUser(
                userRequest.getUsername(),
                userRequest.getPassword(),
                userRequest.getEmail(),
                userRequest.getFullName(),
                userRequest.getRole()
        );
        return ResponseEntity.ok(user);
    }
}
