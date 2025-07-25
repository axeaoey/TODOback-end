# สร้าง Service

## เพิ่มรายละเอียดภายใน Class Service
    //ใช้เพิ่มข้อมูล
    Profile create(Profile profile);
    //ใช้ดึงข้อมูล
    List<Profile> getAll();
    //ใช้แก้ไขข้อมูล
    Optional<Profile> update(Long id, Profile profile);
    //ใช้ลบข้อมูล
    boolean delete(Long id);

## เพิ่ม Service Implement
    //create
    try {
        return profileRepository.save(profile);
    } catch (Exception ex) {
        throw new RuntimeException("ไม่สามารถสร้างข้อมูลได้: " + ex.getMessage(), ex);
    }
    //getAll
    return profileRepository.findAll();
    //update
    return profileRepository.findById(id).map(profileEntity -> {
        profileEntity.setFirstName(updateProfile.getFirstName());
        profileEntity.setLastName(updateProfile.getLastName());
        profileEntity.setGender(updateProfile.getGender());
        profileEntity.setAge(updateProfile.getAge());
        return profileRepository.save(profileEntity);
    });
    //delete
    if (!profileRepository.existsById(id)) return false;
    profileRepository.deleteById(id);
    return true;
