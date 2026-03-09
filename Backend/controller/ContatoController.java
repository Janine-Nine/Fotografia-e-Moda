@RestController
@RequestMapping("/api/contato")
public class ContatoController {

    private final ContatoRepository repository;

    public ContatoController(ContatoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Contato enviarMensagem(@RequestBody Contato contato){
        return repository.save(contato);
    }
}