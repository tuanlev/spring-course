# BEAN VALIDATION

1. Trừ @NotNull thì đa phần những @ khác sẽ khi khởi tạo != null thì mới kiểm tra
2. sử dụng @Valid để kiểm tra các giá trị từ request từ danh sách List

Điểm @Valid	@Validated

Validate DTO object	✅	✅

Validate nested object	✅	✅

Validate primitive param	❌	✅

Support validation group	❌	✅

Phù hợp với	DTO request body	DTO + primitive + group validation