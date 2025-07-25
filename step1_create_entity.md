# สร้าง Profile Entity

## ชื่อตาราง
    @Table(name = "profile_<ชื่อของตัวเองตัวพิมพ์เล็ก>")

## เพิ่มรายละเอียดภายใน Entity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id")
    private Long id;

    @Column(name = "first_name", length = 300, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 300, nullable = false)
    private String lastName;

    @Column(name = "gender", length = 100)
    private String gender;

    @Column(name = "age", length = 3)
    private Integer age;

    @CreationTimestamp
    @Column(name = "create_date", updatable = false)
    private LocalDateTime createDate;

    @UpdateTimestamp
    @Column(name = "update_date")
    private LocalDateTime updateDate;
