# AOP - ASPECT ORIENTED PROGRAMMING

## Dependency
    <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
    </dependency>
### WHAT - ASPECT 
  - lOGIC bạn muốn làm khi gọi 1 hàm cụ tể
### WHEN - ADVICE
  - Thời điểm bạn muốn can thiệp
  - Có các loại như sau before, after, around, afterthrowing, afterreturning
### WHICH - POINTCUT
  - Hàm cụ thể ở "What" đề cập là gì.

### Type of advices

  -   @Before : trước khi thực hiện phương thư
  -   @AfterReturning : Sau khi phương thức thực hiện thành công
  -   @AfterThrowing : 
  -   @After
  -   @Around : Xung quanh phương thức để thực thi phương thức sử dụng ProcessingJoinPoint
  -   