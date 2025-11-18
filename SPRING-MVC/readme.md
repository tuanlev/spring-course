# SPRING-MVC 
### Application.properties

- server.port = 00393 // chỉ định cổng port nếu giá trị = 0  thì nghĩa là random port
- server.servlet.context-path = /tuan   // tương tự @RestController("/tuan") cho toàn bộ controller
- debug = true //
````
1. Cách xem Báo cáo Cấu hình tự động (Auto-Configuration Report)
 Để xem Spring Boot đang "tự động" làm gì, bạn có thể bật chế độ gỡ lỗi (debug).

Cách làm: Thêm thuộc tính debug=true vào tệp application.properties.

Kết quả: Khi khởi động ứng dụng, Spring Boot sẽ in một BÁO CÁO ĐÁNH GIÁ ĐIỀU KIỆN (CONDITIONAL EVALUATION REPORT) rất dài ra Bảng điều khiển (Console).

2. Giải phẫu Báo cáo Cấu hình tự động
   Báo cáo này cho bạn biết chính xác tại sao Spring Boot tạo (hoặc không tạo) một bean nào đó. Nó có 4 phần chính:

Positive Matches (Kết quả trùng khớp tích cực):

Đây là danh sách tất cả các cấu hình và bean mà Spring Boot đã tạo thành công.

Lý do: Vì nó tìm thấy các điều kiện phù hợp. Ví dụ, vì bạn có spring-boot-starter-web (chứa Spring MVC), nó sẽ tự động tạo DispatcherServlet.

Negative Matches (Kết quả trùng khớp tiêu cực):

Đây là danh sách các cấu hình mà Spring Boot đã bỏ qua (không tạo).

Lý do: Vì điều kiện không được đáp ứng. Ví dụ, nếu bạn không thêm thư viện ActiveMQ hay MongoDB vào tệp pom.xml, Spring Boot sẽ không tạo các bean liên quan đến chúng.

Exclusions (Danh sách loại trừ):

Liệt kê các lớp cấu hình tự động mà bạn (nhà phát triển) đã chủ động yêu cầu Spring Boot không được chạy.

Unconditional classes (Các lớp không điều kiện):

Đây là các lớp cơ sở (base classes) mà Spring Boot luôn luôn tạo, bất kể bạn có phụ thuộc gì, vì chúng cần thiết để ứng dụng cơ bản có thể chạy.
--
````

# ANNOTATION

## ĐỊNH NGHĨA
1. RestController ~ (Controller, ResponseBody)
2. methodMapping ~ (RequestMaping(method = RequestMethod.methodname))
3. ResponeBody 

## Dữ liệu
1. RequestBody : lấy dữ liệu từ body truyền vào tham số thường đi cùng với @Valid để validate đối tượng vì mặc dù đối tượng đã được định nghĩa nhưng nếu không có @valid thì nó vẫn truyền vào bình thường
2. RequestParam : ?k=v  lấy param sử dụng MultiValueMap<String,String> ~ Map<String, List<String>> cho nhiều param 
3. RequestHeader: lấy dữ liệu từ header các tham số cần thiết (ts) giống với RequestParam bao gồm (name = value) định nghĩa sẵn tên để không quan trọng tên biến,required nếu dùng optional thì có thể xem như field này không tồn tại, defaulValue
4. PathVariable: /{id} tham số là required dùng Optional là hợp lý nhất không quan trọng required

## Note
1. ResponeEntity ~ tương tự đối tượng res trong express
2. MultiValueMap giúp lưu param oke
3.  ... 