# สร้าง Controller

## เพิ่มรายละเอียดภายใน Class Controller
    //URL ของ Profile
    @RequestMapping("/api/v1/profiles")

    //เรียก profile service
    private final ProfileService profileService;

    //เพิ่ม POST METHOD
    @PostMapping
    public ResponseEntity<Profile> create(@RequestBody Profile profile) {
        return ResponseEntity.ok(profileService.create(profile));
    }

    //เพิ่ม GET METHOD
    @GetMapping
    public ResponseEntity<List<Profile>> getAll() {
        return ResponseEntity.ok(profileService.getAll());
    }

    //เพิ่ม PUT METHOD
    @PutMapping("/{id}")
    public ResponseEntity<Profile> update(@PathVariable Long id, @RequestBody Profile profile) {
        return profileService.update(id, profile)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    //เพิ่ม DELETE METHOD
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return profileService.delete(id)
            ? ResponseEntity.noContent().build()
            : ResponseEntity.notFound().build();
    }