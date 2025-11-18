# LOMBOK 
link : https://projectlombok.org/features
## ANNOTATION

### 1. Khởi tạo
- @AllArgsContructor tương đương với Constructor toàn bộ đối số
- @NoArgsConstructor tương đương với Constructor không đối số 
- @RequiredArgsContructor tương đương với Constructor chỉ với các field final hoặc @NonNull không đi chung được với builder 
    ``  required: java.lang.String,@lombok.NonNull java.lang.String
  found:    java.lang.String,java.lang.String,java.lang.String
  reason: actual and formal argument lists differ in length``
- @Data bao gồm: @Setter/Getter/@ToString/@EqualsAndHashCode/@RequiredArgsConstructor

- @Value @Getter (cho tất cả các trường),@ToString, @EqualsAndHashCode, @AllArgsConstructor (Tạo constructor cho tất cả các trường)
   Tất cả các trường (fields) đều được tự động chuyển thành private và final.


### 2. Sao chép
- @with : nằm trước fied @With String a;
 ```
Cách dùng LombokEntity a = a.withField("add");
mục đích tạo 1 bản clone với giá trị mới (kể cả giá trị bất biến)
```
## tham số

@ToString : of = {"field"} chỉ những field này được in ra, exclude là in ra ngoại trừ những field này