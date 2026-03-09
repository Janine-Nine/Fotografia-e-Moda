@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        if(request.getEmail().equals("admin@fotomoda.com") &&
           request.getSenha().equals("123456")){

            return JwtUtil.generateToken(request.getEmail());
        }

        throw new RuntimeException("Login inválido");
    }
}