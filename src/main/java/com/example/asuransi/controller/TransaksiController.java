@RestController
@RequestMapping("/api/transaksi")
@RequiredArgsConstructor
public class TransaksiController {

    private final TransaksiService transaksiService;

    @PostMapping("/create")
    public ResponseEntity<?> createTransaksi(@RequestBody @Valid TransaksiRequest request) {
        TransaksiResponse response = transaksiService.createTransaksi(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllTransaksi() {
        return ResponseEntity.ok(transaksiService.getAllTransaksi());
    }
}
